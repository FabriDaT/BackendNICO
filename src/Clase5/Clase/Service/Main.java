package Clase5.Clase.Service;

import Clase5.Clase.Model.Persona;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Nico", "37897454", new Date(), "Covid");
        RegistroVacuna registro = new RegistroVacuna();
        IRegistroVacuna proxy = new ProxyRegistroVacuna(registro);
        System.out.println(proxy.vacunar(persona1));
    }
}
