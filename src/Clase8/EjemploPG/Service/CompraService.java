package Clase8.EjemploPG.Service;

import Clase8.EjemploPG.ICompraService;
import Clase8.EjemploPG.Model.Direccion;
import Clase8.EjemploPG.Model.Producto;
import Clase8.EjemploPG.Model.Tarjeta;

import java.util.List;

public class CompraService implements ICompraService {
    private AlmacenService almacenService;
    private PagoService pagoService;
    private EnvioService envioService;

    public CompraService(AlmacenService almacenService , PagoService pagoService , EnvioService envioService) {
        this.almacenService = almacenService;
        this.pagoService = pagoService;
        this.envioService = envioService;
    }

    @Override
    public void procesarCompra(String productoId , int cantidad , Tarjeta tarjeta , Direccion direccion , List<Producto> productos) {
        Producto prod;
        almacenService.setProductos(productos);
        prod = almacenService.buscarProducto(productoId, cantidad);
        if (prod != null){
            double montoCobrar = prod.getValor() * cantidad;
            if(pagoService.procesarPago(tarjeta,montoCobrar)){
                envioService.procesarEnvio(productos,direccion);
                }
            }
        }
    }




