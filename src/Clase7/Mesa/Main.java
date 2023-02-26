package Clase7.Mesa;

public class Main {
    private static final String colores[] = {"verde", "rojo"};

    public static void main(String[] args) {
        ArbolFactory factory = new ArbolFactory();

        for (int i=0; i<1000000; i++){
            if (i < 500000){
                Arbol test1 = factory.getArbolHash(colores[0]);
                System.out.println(test1);
            } else {
                Arbol test1 = factory.getArbolHash(colores[1]);
                System.out.println(test1);
            }
            Runtime runtime = Runtime.getRuntime();
            System.out.println("Memoria usada: " + (runtime.totalMemory() -
                    runtime.freeMemory()) / (1024 * 1024));
        }
    }
}
