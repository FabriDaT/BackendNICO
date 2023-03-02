package Clase10;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        Integer sumas = 0;
        Integer promedio = 0;

        for (int i = 0; i < 15; i++) {
            numeros.add(i);
        }
        if (numeros.size() == 0){
            logger.warn("La longitud de la lista es 0");
        } else{
            for (int i = 0; i < numeros.size(); i++) {
                if (i == 6){
                    logger.info("La longitud de la lista es mayor a 5");
                } else if (i == 11) {
                    logger.info("La longitud de la lista es mayor a 10");
                }
                sumas += numeros.get(i);
                promedio = sumas / numeros.size();
            }
            logger.info("El promedio de la lista es " + promedio);
        }
    }
}

