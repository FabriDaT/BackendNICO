package Clase8.Clase.API;

public class ApiCantidad {
    public int descuento(int cantidad){
        int descuento = 0;

        if (cantidad > 12){
            descuento = 15;
        }
        return descuento;
    }
}
