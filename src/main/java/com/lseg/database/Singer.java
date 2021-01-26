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
public class Singer {

    private long id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private Album album;

}
