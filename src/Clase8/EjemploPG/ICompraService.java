package Clase8.EjemploPG;

import Clase8.EjemploPG.Model.Direccion;
import Clase8.EjemploPG.Model.Producto;
import Clase8.EjemploPG.Model.Tarjeta;

import java.util.List;

public interface ICompraService {
    public void procesarCompra(String productoId, int cantidad, Tarjeta tarjeta, Direccion direccion,
                               List<Producto> productos);
}
