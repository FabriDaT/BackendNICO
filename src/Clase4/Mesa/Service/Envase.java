package Clase4.Mesa.Service;

import Clase4.Mesa.Model.Articulo;

public class Envase extends AnalistaDeCalidad {

    @Override
    public void control(Articulo articulo) {
        if (articulo.getEnvasado().equals("Sano") || articulo.getEnvasado().equals("Casi Sano")){
            System.out.println("Control de calidad aprobado");
        } else{
            System.out.println("Envaso incorrecto");
        }
    }
}
