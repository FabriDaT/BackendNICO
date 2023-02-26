package Clase7.EjemploPG;

import java.util.HashMap;

public class ComidaFactory {
    private static final HashMap<String, Comida> comidaMap = new HashMap<>();

    public Comida getComida(String tipoComida){
        Comida comida = (Comida) comidaMap.get(tipoComida);
        if (comida == null){
            comida = new Comida(tipoComida);
            comidaMap.put(tipoComida, comida);
            System.out.println("Creando objecto comida de tipo: " + tipoComida);

            return comida;
        }
        System.out.println("Recuperando Objecto de comida tipo: " + tipoComida);
        return comida;
    }
}
