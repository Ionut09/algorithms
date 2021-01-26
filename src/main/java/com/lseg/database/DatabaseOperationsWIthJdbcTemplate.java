package com.lseg.database;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static com.lseg.database.SingerRepository.getSingersByFirstNameQuery;
import static com.lseg.database.SingerRepository.insertSingerStatement;

public class DatabaseOperationsWIthJdbcTemplate {

    private static final DriverManagerDataSource dataSource;

    private static final JdbcTemplate jdbcTemplate;

    static { //bloc static se executa la incarcarea clasei
        dataSource = new DriverManagerDataSource();
        dataSource.setPassword("secret-pass");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3321/spotify?useSsl=true&serverTimezone=EET");
        jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
    }

    { //instance block

    }

    public static void main(String... args) {


        List<Singer> singerList = jdbcTemplate.query(getSingersByFirstNameQuery,
                DatabaseOperationsWIthJdbcTemplate::mapRowToSinger,
                "John");

//        int updatedRows = jdbcTemplate.update(insertSingerStatement, "Johnny", "Cash", LocalDate.of(1950, 1, 1));

        int updatedRows = jdbcTemplate.update("delete from singer where id > ?", 6);
        if (updatedRows != 1) {
            System.out.println("Bad delete");
        } else {
            System.out.println("Singer deleted succesfully");
        }

//        jdbcTemplate.batchUpdate()
        singerList.forEach(System.out::println);
    }

    private static Singer mapRowToSinger(ResultSet rs, int rowNumber) throws SQLException {
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
        return singer;
    }
}
