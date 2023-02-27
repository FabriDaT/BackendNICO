package Clase8.Clase.Facade;

import Clase8.Clase.Model.Producto;
import Clase8.Clase.Model.Tarjeta;

public interface IFacadeDescuento {
    public int calculoDescuento(Producto producto, Tarjeta tarjeta, int cantidad);
}
