package com.movie.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public class MovieDTO {
    private Long id;
    private String titulo;
    private int year;
    private double valoracion;
    private String descripcion;
    private List<DirectorDTO> directores;
    private List<ActorDTO> actores;
    private List<MovieGeneroDTO> generos;

    // Lista estática de 10 películas
    public static List<MovieDTO> getStaticMovieList() {
        DirectorDTO director1 = new DirectorDTO(1L, "Director1", "Apellido1");
        DirectorDTO director2 = new DirectorDTO(2L, "Director2", "Apellido2");

        ActorDTO actor1 = new ActorDTO(1L, "Actor1", "Apellido1");
        ActorDTO actor2 = new ActorDTO(2L, "Actor2", "Apellido2");

        MovieGeneroDTO genero1 = new MovieGeneroDTO(1L, "Acción");
        MovieGeneroDTO genero2 = new MovieGeneroDTO(2L, "Comedia");

        return Arrays.asList(
                new MovieDTO(1L, "Película1", 2020, 4.5, "Descripción1",
                        Arrays.asList(director1), Arrays.asList(actor1), Arrays.asList(genero1)),
                new MovieDTO(2L, "Película2", 2021, 3.8, "Descripción2",
                        Arrays.asList(director2), Arrays.asList(actor2), Arrays.asList(genero2)),
                new MovieDTO(3L, "Película3", 2019, 4.0, "Descripción3",
                        Arrays.asList(director1), Arrays.asList(actor2), Arrays.asList(genero1)),
                new MovieDTO(4L, "Película4", 2018, 3.5, "Descripción4",
                        Arrays.asList(director2), Arrays.asList(actor1), Arrays.asList(genero2)),
                new MovieDTO(5L, "Película5", 2017, 4.2, "Descripción5",
                        Arrays.asList(director1), Arrays.asList(actor1), Arrays.asList(genero1)),
                new MovieDTO(6L, "Película6", 2016, 3.7, "Descripción6",
                        Arrays.asList(director2), Arrays.asList(actor2), Arrays.asList(genero2)),
                new MovieDTO(7L, "Película7", 2015, 4.1, "Descripción7",
                        Arrays.asList(director1), Arrays.asList(actor1), Arrays.asList(genero1)),
                new MovieDTO(8L, "Película8", 2014, 3.9, "Descripción8",
                        Arrays.asList(director2), Arrays.asList(actor2), Arrays.asList(genero2)),
                new MovieDTO(9L, "Película9", 2013, 4.3, "Descripción9",
                        Arrays.asList(director1), Arrays.asList(actor1), Arrays.asList(genero1)),
                new MovieDTO(10L, "Película10", 2012, 3.6, "Descripción10",
                        Arrays.asList(director2), Arrays.asList(actor2), Arrays.asList(genero2))
        );
    }
}
