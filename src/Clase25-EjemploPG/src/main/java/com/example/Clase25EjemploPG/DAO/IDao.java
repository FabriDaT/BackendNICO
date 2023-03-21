package com.example.Clase25EjemploPG.DAO;

import java.util.List;

public interface IDao<T> {
    public void crearTabla();

    // T quiere decir uqe acepta cualquier tipo de variable, clase, objeto
    public T guardar(T t);
    public void eliminar(Long id);
    public T buscar(Long id);
    public List<T> buscarTodos();
}
