package com.movie.service;


import com.movie.dto.MovieDTO;
import com.movie.dto.MovieListDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements IMovieService{


    @Override
    public List<MovieDTO> listAll() {
        return MovieDTO.getStaticMovieList();
    }

    @Override
    public MovieDTO save(MovieDTO dto) {
        return null;
    }

    @Override
    public MovieDTO getById(Long aLong) {
          MovieDTO movieDTO = MovieDTO.getStaticMovieList().stream().filter(x -> x.getId().equals(aLong)).findFirst()
                  .orElseThrow(()->  new RuntimeException("Not Foudn Movie"));
          return movieDTO;
    }



    @Override
    public List<MovieListDTO> findList() {
        return MovieDTO.getStaticMovieList().stream().map(
                movieDTO -> new MovieListDTO(movieDTO.getTitulo(), movieDTO.getYear(), movieDTO.getValoracion())
        ).collect(Collectors.toList());
    }
}
