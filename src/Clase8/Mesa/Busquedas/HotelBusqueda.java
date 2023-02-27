package Clase8.Mesa.Busquedas;

import Clase8.Mesa.Model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelBusqueda {
    private List<Hotel> hoteles;
    private List<Hotel> hotelesDisponibles = new ArrayList<>();

    public HotelBusqueda(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public List<Hotel> getHotelesDisponibles(String ciudad, String fechaEntrada, String fechaSalida){
        for (Hotel h: this.hoteles) {
            if (h.getCuidad().equals(ciudad) &&
            h.getFechaEntrada().equals(fechaEntrada) &&
            h.getFechaSalida().equals(fechaSalida)){
                hotelesDisponibles.add(h);
            }
        }
        return hotelesDisponibles;
    }
}
