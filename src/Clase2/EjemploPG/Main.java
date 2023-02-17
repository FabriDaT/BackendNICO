package Clase2.EjemploPG;

public class Main {
    public static void main(String[] args){
        Cocineros cocinero1 = new CocineroVeggie();
        Cocineros cocinero2 = new CocineroNoVeggie();
        cocinero1.hacerPizza();
        cocinero1.prepararIngredientes();
        cocinero1.agregarIngredientes();

        cocinero2.hacerPizza();
    }
}
