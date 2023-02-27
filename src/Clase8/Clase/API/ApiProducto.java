package Clase8.Clase.API;

import Clase8.Clase.Model.Producto;

public class ApiProducto {
    public int descuento(Producto producto){
        int descuento = 0;
        if (producto.getTipo().equals("Lata")){
            descuento = 10;
        }
        return descuento;
    }
}
