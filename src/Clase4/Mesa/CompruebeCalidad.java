package Clase4.Mesa;

import Clase4.Mesa.Model.Articulo;
import Clase4.Mesa.Service.AnalistaDeCalidad;
import Clase4.Mesa.Service.Envase;
import Clase4.Mesa.Service.Lote;
import Clase4.Mesa.Service.Peso;

public class CompruebeCalidad {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Gaseosa", "Sano", 1500, 1250);
        Articulo articulo2 = new Articulo("Vino", "Casi Sano", 1000, 1600);

        AnalistaDeCalidad lote = new Lote();
        AnalistaDeCalidad peso = new Peso();
        AnalistaDeCalidad envase = new Envase();

        lote.setSigAnalisis(peso);
        peso.setSigAnalisis(envase);

        lote.control(articulo1);
        lote.control(articulo2);
    }

}
