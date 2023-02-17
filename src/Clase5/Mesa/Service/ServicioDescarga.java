package Clase5.Mesa.Service;


import Clase5.Mesa.Model.Usuario;

public class ServicioDescarga implements IServicioDescarga {

    @Override
    public String descarga(Usuario usuario) {
        return "El usuario " + usuario.getId() + " puede descargar canciones";
    }
}
