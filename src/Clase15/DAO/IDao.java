package Clase15.DAO;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {
    public T alta(T t) throws SQLException;
    public void eliminar(Long id);
    public T buscar(Long id);

    public T modificar(Long id);
    public List<T> buscarTodos();

}
