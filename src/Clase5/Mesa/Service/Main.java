package Clase5.Mesa.Service;

import Clase5.Mesa.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("1a2b", "Free");
        Usuario usuario2 = new Usuario("7a8b", "Premium");

        ServicioDescarga descarga = new ServicioDescarga();
        IServicioDescarga proxy = new ProxyServicioDescarga(descarga);

        //ProxyServicioDescarga proxy = new ProxyServicioDescarga(descarga);

        System.out.println(proxy.descarga(usuario1));
        System.out.println(proxy.descarga(usuario2));


    }
}
