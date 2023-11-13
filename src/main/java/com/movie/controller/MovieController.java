package com.movie.controller;


import com.movie.dto.MovieDTO;
import com.movie.dto.MovieListDTO;
import com.movie.service.IMovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

 private final IMovieService movieService;

    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<MovieListDTO>> getListAll(){
        List<MovieListDTO> list = this.movieService.findList();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDTO> getDetaillMovie(@PathVariable("id") Long id) {
        MovieDTO movieDetailDTO = this.movieService.getById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(movieDetailDTO);
    }
}
