package Clase6.Service;

import Clase6.Model.Serie;

public class ServicioSerie implements ISerie{
    @Override
    public String getPelicula(Serie nombreSerie) throws Exception {
        nombreSerie.setCantVistasSerie(nombreSerie.getCantVistasSerie()+1);
        return "www." + nombreSerie.getNombreSerie();
    }
}
