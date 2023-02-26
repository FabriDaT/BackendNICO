package Clase7.EjemploPG2;

import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap<String, Circulo> circuloMap = new HashMap<>(); // aca es donde se carga el atributo compartido, en este caso color.

    public static Circulo getCirculo(String color){
        Circulo circulo = circuloMap.get(color); //recordar que el atributo color es un string
        if (circulo == null){
            circulo = new Circulo(color);
            circuloMap.put(color, circulo);
            System.out.println("Creando circulo de color: " + color);
            return circulo;

        }else {
            System.out.println("Utilizando circulo creado de color " + color);
            return circulo;
    }
    }


}
