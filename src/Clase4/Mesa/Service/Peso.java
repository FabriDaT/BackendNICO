package Clase4.Mesa.Service;

import Clase4.Mesa.Model.Articulo;

public class Peso extends AnalistaDeCalidad {

    @Override
    public void control(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            getSigAnalisis().control(articulo);
        }else{
            System.out.println("Peso incorrecto");
        }
    }
}
