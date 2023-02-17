package Clase4.Mesa.Service;

import Clase4.Mesa.Model.Articulo;

public class Lote extends AnalistaDeCalidad {

    @Override
    public void control(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            getSigAnalisis().control(articulo);
        }else{
            System.out.println("Numero de lote incorrecto");
        }
    }
}
