package com.example.Clase31Mesa.service;

import com.example.Clase31Mesa.entity.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IService {
    List<Usuarios> findAll();
    Optional<Usuarios> findById(Long id);
    Usuarios save(Usuarios usuarios);
    String delete(Long id);
    String update(Usuarios usuarios);
}
