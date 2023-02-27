package Clase8.Clase.Facade;

import Clase8.Clase.API.ApiCantidad;
import Clase8.Clase.API.ApiProducto;
import Clase8.Clase.API.ApiTarjeta;
import Clase8.Clase.Model.Producto;
import Clase8.Clase.Model.Tarjeta;

public class ImplFacadeDescuento implements IFacadeDescuento{
    private ApiCantidad apiCantidad;
    private ApiProducto apiProducto;
    private ApiTarjeta apiTarjeta;

    public ImplFacadeDescuento(ApiCantidad apiCantidad , ApiProducto apiProducto , ApiTarjeta apiTarjeta) {
        this.apiCantidad = apiCantidad;
        this.apiProducto = apiProducto;
        this.apiTarjeta = apiTarjeta;
    }

    @Override
    public int calculoDescuento(Producto producto , Tarjeta tarjeta , int cantidad) {
        return apiCantidad.descuento(cantidad) +
                apiProducto.descuento(producto) +
                apiTarjeta.descuento(tarjeta);
    }

}
