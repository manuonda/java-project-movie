package com.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovieListDTO {
    private String title;
    private int year;
    private double valoracion;



}
