package com.movie.service;

import com.movie.dto.ActorDTO;

import java.util.List;

public interface IGenericService <T,ID>{
    List<T> listAll();

    T save(T dto);

    T getById(ID id);

}
