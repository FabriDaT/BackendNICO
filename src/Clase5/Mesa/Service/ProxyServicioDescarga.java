package Clase5.Mesa.Service;

import Clase5.Mesa.Model.Usuario;

public class ProxyServicioDescarga implements IServicioDescarga{
    private ServicioDescarga servicioDescarga;

    public ProxyServicioDescarga(ServicioDescarga servicioDescarga) {
        this.servicioDescarga = servicioDescarga;
    }



    @Override
    public String descarga(Usuario usuario) {
        String mensaje = "El usuario no puede descargar canciones";
        if (usuario.getTipo().equals("Premium")){
            mensaje = servicioDescarga.descarga(usuario);
        }
        return mensaje;
    }
}
