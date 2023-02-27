package Clase8.Mesa.Busquedas;

import Clase8.Mesa.Model.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class VueloBusqueda {
    private List<Vuelo> vuelos;
    private List<Vuelo> vuelosDisponibles = new ArrayList<>();

    public VueloBusqueda(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public List<Vuelo> getVuelosDisponibles(String ciudad, String fechaVuelo, String fechaRegreso ) {
        for (Vuelo v : vuelos) {
            if (v.getDestino().equals(ciudad) &&
                    v.getFechaSalida().equals(fechaVuelo) &&
                    v.getFechaRegreso().equals(fechaRegreso)){
                vuelosDisponibles.add(v);
            }
        }
        return vuelosDisponibles;
    }
}
