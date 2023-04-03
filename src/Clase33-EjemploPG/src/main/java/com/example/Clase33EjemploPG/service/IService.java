package com.example.Clase33EjemploPG.service;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
    List<T> findAll();
    Optional<T> findById(Long id);
    T save(T t);
    String delete(Long id);
    String update(T t);
}
