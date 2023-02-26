package Clase7.Clase;

import java.util.HashMap;

public class ComputadoraFactory {
    private final HashMap<String, Computadora> computadoraHashMap = new HashMap<>();

    public Computadora getComputadoraHashMap(int ram, int disco) {
        String id = ram + "-" + disco;
        Computadora computadoraNueva = computadoraHashMap.get(id);
        if (computadoraNueva == null){
            computadoraNueva = new Computadora(ram, disco);
            computadoraHashMap.put(id, computadoraNueva);
            System.out.println("Creando una nueva computadora");
            computadoraNueva.setContador(computadoraNueva.getContador() + 1);
        } else{
            System.out.println("Utilizando una computadora vieja" );
            computadoraNueva.setContador(computadoraNueva.getContador() + 1);
        }
        return computadoraNueva;
    }
}
