package Clase14.EjemploPG.dao;

import java.util.List;

public interface IDao<T> {
    // T quiere decir uqe acepta cualquier tipo de variable, clase, objeto
    public T guardar(T t);
    public void eliminar(Long id);
    public T buscar(Long id);
    public List<T> buscarTodos();


}
