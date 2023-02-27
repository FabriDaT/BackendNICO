package Clase8.EjemploPG;

import Clase8.EjemploPG.Model.Direccion;
import Clase8.EjemploPG.Model.Producto;
import Clase8.EjemploPG.Model.Tarjeta;
import Clase8.EjemploPG.Service.AlmacenService;
import Clase8.EjemploPG.Service.CompraService;
import Clase8.EjemploPG.Service.EnvioService;
import Clase8.EjemploPG.Service.PagoService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto("1", 5, 1000, "mouse");
        Producto producto2 = new Producto("2", 5, 3000, "teclado");
        productos.add(producto1);
        productos.add(producto2);

        Tarjeta tarjeta = new Tarjeta("1111222233334444","012","2025/07/09");
        Direccion direccion = new Direccion("Cervantes","564","5850","Media Luna","Rio Tercero");

        ICompraService compraService = new CompraService(new AlmacenService(), new PagoService(), new EnvioService());
        compraService.procesarCompra("1", 2, tarjeta, direccion, productos);
    }
}
