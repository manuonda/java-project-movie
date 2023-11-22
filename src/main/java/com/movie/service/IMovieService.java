package com.movie.service;

import com.movie.dto.MovieDTO;
import com.movie.dto.MovieListDTO;

import java.util.List;

public interface IMovieService extends IGenericService<MovieDTO, Long> {

    List<MovieListDTO> findList() ;
}
