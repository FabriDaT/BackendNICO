package Clase8.Clase;

import Clase8.Clase.API.ApiCantidad;
import Clase8.Clase.API.ApiProducto;
import Clase8.Clase.API.ApiTarjeta;
import Clase8.Clase.Facade.IFacadeDescuento;
import Clase8.Clase.Facade.ImplFacadeDescuento;
import Clase8.Clase.Model.Producto;
import Clase8.Clase.Model.Tarjeta;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Teclado", "Lata");
        Tarjeta tarjeta2 = new Tarjeta("11111111111", "Star Bank");

        IFacadeDescuento facadeDescuento = new ImplFacadeDescuento(new ApiCantidad(), new ApiProducto(), new ApiTarjeta());
        int descuento = facadeDescuento.calculoDescuento(producto1, tarjeta2, 15);
        System.out.println("El descuento del producto " + producto1.getNombre() + " es de: " + descuento + "%");

    }
}
