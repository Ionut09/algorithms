drop database if exists spotify;
create database spotify;
use spotify;

create table singer
(
    id        bigint auto_increment primary key,
    firstName varchar(50) null,
    lastName  varchar(50) not null,
    birthDate date        null
);

INSERT INTO spotify.singer (id, firstName, lastName, birthDate) VALUES (1, 'John', 'Lennon', '1940-10-09');
INSERT INTO spotify.singer (id, firstName, lastName, birthDate) VALUES (2, 'Ringo', 'Starr', '1940-07-07');
INSERT INTO spotify.singer (id, firstName, lastName, birthDate) VALUES (3, 'Pete', 'Best', '1941-11-24');
INSERT INTO spotify.singer (id, firstName, lastName, birthDate) VALUES (4, 'Elvis', 'Presley', '1935-01-08');
INSERT INTO spotify.singer (id, firstName, lastName, birthDate) VALUES (5, 'Michael', 'Jackson', '1958-08-29');
INSERT INTO spotify.singer (id, firstName, lastName, birthDate) VALUES (6, 'John', 'Doe', '1940-10-09');

create table album
(
    id          bigint auto_increment primary key,
    singerId    bigint       null,
    name        varchar(50)  not null,
    releaseDate date         not null,
    description varchar(200) null,
    constraint album_singer_id_fk
        foreign key (singerId) references singer (id)
            on update cascade on delete cascade
);

INSERT INTO spotify.album (id, singerId, name, releaseDate, description) VALUES (1, 1, 'The Beatles', '1968-01-01', 'Beatles album');
INSERT INTO spotify.album (id, singerId, name, releaseDate, description) VALUES (2, 2, 'The Beatles', '1968-01-01', 'Beatles album');
INSERT INTO spotify.album (id, singerId, name, releaseDate, description) VALUES (3, 3, 'The Beatles', '1968-01-01', 'Beatles album');
INSERT INTO spotify.album (id, singerId, name, releaseDate, description) VALUES (4, 5, 'Thriller', '1982-01-01', 'Best sold all time');
INSERT INTO spotify.album (id, singerId, name, releaseDate, description) VALUES (5, 4, 'Heartbreak Hotel', '1956-01-05', 'Best Elvis song');
