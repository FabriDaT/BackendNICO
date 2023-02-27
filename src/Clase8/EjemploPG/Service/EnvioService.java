package Clase8.EjemploPG.Service;

import Clase8.EjemploPG.Model.Direccion;
import Clase8.EjemploPG.Model.Producto;

import java.util.List;

public class EnvioService {

    public void procesarEnvio(List<Producto> productos, Direccion direccion){
        System.out.println("Enviando productos a " + direccion.getCalle() +" "+ direccion.getNro() +","+ direccion.getBarrio());
    }
}

