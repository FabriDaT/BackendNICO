package Clase8.Mesa.Facade;

import Clase8.Mesa.Busquedas.HotelBusqueda;
import Clase8.Mesa.Busquedas.VueloBusqueda;

public class Busqueda implements IBusqueda{

    private VueloBusqueda vueloBusqueda;
    private HotelBusqueda hotelBusqueda;

    public Busqueda(VueloBusqueda vueloBusqueda , HotelBusqueda hotelBusqueda) {
        this.vueloBusqueda = vueloBusqueda;
        this.hotelBusqueda = hotelBusqueda;
    }

    @Override
    public void busqueda(String ciudad, String fechaIda, String fechaVuelta) {
        if (!vueloBusqueda.getVuelosDisponibles(ciudad, fechaIda, fechaVuelta).isEmpty() &&
        !hotelBusqueda.getHotelesDisponibles(ciudad, fechaIda, fechaVuelta).isEmpty()){
            System.out.println("Los vuelos y hoteles disponibles son: " + vueloBusqueda + hotelBusqueda);
        } else if (vueloBusqueda.getVuelosDisponibles(ciudad, fechaIda, fechaVuelta).isEmpty()) {
            System.out.println("No se encuentran vuelos disponibles");
        } else {
            System.out.println("No se encuentran hoteles disponibles");
        }

    }
}
