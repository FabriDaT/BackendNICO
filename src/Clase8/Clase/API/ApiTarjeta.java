package Clase8.Clase.API;

import Clase8.Clase.Model.Tarjeta;

public class ApiTarjeta {
    public int descuento(Tarjeta tarjeta){
        int descuento = 0;
        if (tarjeta.getBanco().equals("Star Bank")){
            descuento = 20;
        }
        return descuento;
    }
}
