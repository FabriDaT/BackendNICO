package Clase7.EjemploPG;

public class Main {
    public static void main(String[] args) {
        final ComidaFactory comida = new ComidaFactory();

        Comida pastaVerdura = comida.getComida("Pasta");
        pastaVerdura.setPrecio(1000);

        Comida pastaCarne = comida.getComida("Pasta");
        System.out.println(pastaCarne.toString());
    }
}
