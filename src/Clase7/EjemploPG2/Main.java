package Clase7.EjemploPG2;

public class Main {
    private static final String colores[] = {"Rojo", "Azul", "Blanco"};
    public static void main(String[] args) {
        for (int i=0; i<50; i++){
            Circulo circulo = FlyweightFactory.getCirculo(colorAleatorio());
            circulo.setRadio(i * 5);
            circulo.setTamanio("tamaño " + (i * 2));
            circulo.toString();
        }
    }

    private static String colorAleatorio(){
        return colores[(int)(Math.random()* colores.length)];
    }
}

