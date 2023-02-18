package Clase6.Service;

import Clase6.Model.Serie;

public class ProxySerie implements ISerie{
    private ServicioSerie servicioSerie;
    private int cantPedidos;


    public ProxySerie(ServicioSerie servicioSerie) {
        this.servicioSerie = servicioSerie;
    }

    @Override
    public String getPelicula(Serie nombreSerie) throws Exception {
        this.cantPedidos++;
        servicioSerie.getPelicula(nombreSerie);
        if (cantPedidos >= 5 ){
            throw new Exception("Limite de pedidos alcanzados");
        } else if (nombreSerie.getCantVistasSerie() >= 5) {
            throw new Exception("Limite de visualizaciones alcanzados");
        }
        return "Te quedan " + (5 - this.cantPedidos) + " pedidos y "  + (nombreSerie.getCantVistasSerie()) + " visualizaciones de la serie " + nombreSerie.getNombreSerie();
    }
}
