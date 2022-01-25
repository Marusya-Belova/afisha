package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Movie {
    private int id;
    private String nameMovie;
    private String genre;
    private String image;
    private String dateRelease;
}
