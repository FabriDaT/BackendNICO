package Clase7.Clase;

public class Main {
    public static void main(String[] args) {
        ComputadoraFactory factory = new ComputadoraFactory();
        Computadora c1 = factory.getComputadoraHashMap(2, 128);
        System.out.println(c1.toString());

        Computadora c2 = factory.getComputadoraHashMap(2, 128);
        System.out.println(c2.toString());

        Computadora c3 = factory.getComputadoraHashMap(6, 500);
        System.out.println(c3.toString());

        Computadora c4 = factory.getComputadoraHashMap(6, 500);
        System.out.println(c4.toString());

        Computadora c5 = factory.getComputadoraHashMap(6, 500);
        System.out.println(c5.toString());


    }
}
