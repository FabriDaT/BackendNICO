package com.example.Clase28.repository;

import java.util.List;

public interface Idao <T> {
    T agregar(T t);
    void eliminar(Long id);
    List<T> listarTodos();
    T listar(Long id);
    T modificar(Long id , T t);
}
