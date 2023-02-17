package Clase5.Clase.Service;

import Clase5.Clase.Model.Persona;

public class RegistroVacuna implements IRegistroVacuna{

    @Override
    public String vacunar(Persona persona) {
        return persona.getNombre() + " se vacuno con " + persona.getVacuna();
    }
}
