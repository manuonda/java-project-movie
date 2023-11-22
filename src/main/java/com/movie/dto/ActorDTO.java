package com.movie.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ActorDTO {
    private Long id;
    private String nombre;
    private String apellido;
}
