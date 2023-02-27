package Clase8.Mesa;

import Clase8.Mesa.Busquedas.HotelBusqueda;
import Clase8.Mesa.Busquedas.VueloBusqueda;
import Clase8.Mesa.Facade.Busqueda;
import Clase8.Mesa.Facade.IBusqueda;
import Clase8.Mesa.Model.Hotel;
import Clase8.Mesa.Model.Vuelo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("26/02/2023", "19/02/2023", "Roma");
        Hotel hotel2 = new Hotel("27/02/2023", "19/02/2023", "Paris");
        Hotel hotel3 = new Hotel("15/02/2023", "01/02/2023", "Buenos Aires");

        Vuelo vuelo1 = new Vuelo("19/02/2023", "26/02/2023", "Buenos Aires", "Roma");
        Vuelo vuelo2 = new Vuelo("26/01/2023", "20/02/2023", "Buenos Aires", "Paris");
        Vuelo vuelo3 = new Vuelo("15/01/2023", "02/02/2023", "Buenos Aires", "Santiago");

        List<Hotel> hoteles = List.of(hotel1, hotel2, hotel3);
        List<Vuelo> vuelos = List.of(vuelo1, vuelo2, vuelo3);


        HotelBusqueda hotelBusqueda = new HotelBusqueda(hoteles);
        VueloBusqueda vueloBusqueda = new VueloBusqueda(vuelos);

        IBusqueda busqueda = new Busqueda(vueloBusqueda, hotelBusqueda);
        busqueda.busqueda("Roma", "19/02/2023", "26/02/2023");
    }
}
