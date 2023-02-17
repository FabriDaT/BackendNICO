package Clase5.Clase.Service;

import Clase5.Clase.Model.Persona;

import java.util.Date;

public class ProxyRegistroVacuna implements IRegistroVacuna{
    private RegistroVacuna registroVacuna;

    public ProxyRegistroVacuna(RegistroVacuna registroVacuna) {
        this.registroVacuna = registroVacuna;
    }

    public boolean controlFecha(Persona persona){
        Date hoy = new Date();
        return !persona.getFecha().before(hoy);
    }

    @Override
    public String vacunar(Persona persona) {
        String mensaje = "Veni mas tarde";
        if (controlFecha(persona)){
            mensaje = registroVacuna.vacunar(persona);
        }
        return mensaje;
    }
}
