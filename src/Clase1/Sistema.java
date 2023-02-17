package Clase1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Persona> listado;

    public Sistema(){
        listado = new ArrayList<>();
    }
    public void agregarPersonas(Persona p){
        if (p.esMayor() && p.nombreLargo()){
            listado.add(p);
        }
    }
    public int largoLista(){
        return listado.size();
    }
}
