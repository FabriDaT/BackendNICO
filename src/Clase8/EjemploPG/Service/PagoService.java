package Clase8.EjemploPG.Service;

import Clase8.EjemploPG.Model.Tarjeta;

public class PagoService {
    private boolean pagoRealizado;
    public Boolean procesarPago(Tarjeta tarjeta, double montoACobrar){
        pagoRealizado = false;
        if(tarjeta != null && tarjeta.getNumerosFrente() != null &&
                tarjeta.getCodSeguridad() != null){
            System.out.println("Procesando el pago por "+
                    montoACobrar);
            pagoRealizado = true;
        }
        return pagoRealizado;

}

}
