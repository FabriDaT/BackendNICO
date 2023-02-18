package Clase6.Service;

import Clase6.Model.Serie;

public class Main {
    public static void main(String[] args) {
        try {
            Serie serie1 = new Serie("Breaking Bad");
            Serie serie2 = new Serie("Vikings");

            ISerie proxy = new ProxySerie(new ServicioSerie());

            System.out.println(proxy.getPelicula(serie1));
            System.out.println(proxy.getPelicula(serie1));
            System.out.println(proxy.getPelicula(serie2));
            System.out.println(proxy.getPelicula(serie2));
            System.out.println(proxy.getPelicula(serie2));
            System.out.println(proxy.getPelicula(serie1));
            System.out.println(proxy.getPelicula(serie1));

        } catch (Exception e){
            System.err.println(e);
        }
    }
}
