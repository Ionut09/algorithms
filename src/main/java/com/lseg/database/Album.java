package com.lseg.database;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Album {

    private long id;

    private String name;

    private String description;

    private LocalDate releaseDate;
}
