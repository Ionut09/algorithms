package com.lseg.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * pt a porni un container cu mysql la portul 3321
 * docker run -d -p 3321:3306 --name=mysql-server-local --env="MYSQL_ROOT_PASSWORD=secret-pass" mysql
 *
 * docker start mysql-server-local
 * pt a porni ulterior containerul
 */
public class SingerRepository {

    public final static String getSingersByFirstNameQuery = "SELECT s.id as sid, \n" +
            "       lastName,\n" +
            "       firstName,\n" +
            "       birthDate,\n" +
            "       a.id as aid,\n" +
            "       singerId,\n" +
            "       name,\n" +
            "       releaseDate,\n" +
            "       description" +
            " FROM singer s" +
            " LEFT JOIN album a on s.id = a.singerId\n" +
            " WHERE s.firstName LIKE ?";

    public final static String insertSingerStatement = "INSERT INTO singer (firstName, lastName, birthDate) " +
            "VALUES (?, ?, ?)";

    public static void main(String... args) {
        SingerRepository repository = new SingerRepository();
        repository.getSingerByFirstName("John")
                  .forEach(System.out::println);

        Singer singer = Singer.builder()
                              .firstName("Johnny")
                              .lastName("Cash")
                              .birthDate(LocalDate.of(1950, 6, 12))
                              .build();
//        repository.createSinger(singer);


    }

    public List<Singer> getSingerByFirstName(String firstName) {

        try (Connection connection = createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(getSingersByFirstNameQuery);
            preparedStatement.setString(1, "%" + firstName + "%");

            ResultSet rs = preparedStatement.executeQuery();
            List<Singer> singers = new ArrayList<>();
            while (rs.next()) {
                Singer singer = Singer.builder()
                                      .id(rs.getLong("sid"))
                                      .lastName(rs.getString("lastName"))
                                      .firstName(rs.getString("firstName"))
                                      .birthDate(rs.getDate("birthDate").toLocalDate())
                                      .build();

                if (rs.getLong("aid") != 0) {
                    Album album = Album.builder()
                                       .id(rs.getLong("aid"))
                                       .name(rs.getString("name"))
                                       .description(rs.getString("description"))
                                       .releaseDate(rs.getDate("releaseDate").toLocalDate())
                                       .build();
                    singer.setAlbum(album);
                }
                singers.add(singer);
            }
            return singers;

        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute query %s %n to database", getSingersByFirstNameQuery),
                    exc);
        }
    }

    public int createSinger(Singer singer) {
        try (Connection connection = createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSingerStatement);

            preparedStatement.setString(1, singer.getFirstName());
            preparedStatement.setString(2, singer.getLastName());
            preparedStatement.setDate(3, Date.valueOf(singer.getBirthDate()));

            int rowsUpdated = preparedStatement.executeUpdate();//toate statementurile de write
            if (rowsUpdated != 1) {
                throw new IllegalStateException("Only one singer row should be inserted!!!");
            } else {
                System.out.println("Singer created");
            }
            return rowsUpdated;
        } catch (SQLException exc) {
            throw new RuntimeException(String.format("Could not execute statement %s %n to database", insertSingerStatement),
                    exc);
        }
    }

    private Connection createConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3321/spotify?useSsl=true&serverTimezone=EET",
                    "root",
                    "secret-pass");
        } catch (SQLException exc) {
            throw new RuntimeException("Could not connect to database", exc);
        }
    }
}
