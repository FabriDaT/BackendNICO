package com.example.Clase34EjemploIntegrador.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IService<T> {
    Set<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void delete(Long id);
    String update(T t);
}
