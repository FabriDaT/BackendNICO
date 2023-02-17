package Clase2.EjemploPG;

public class CocineroVeggie extends Cocineros{
    @Override
    public void prepararIngredientes() {
        System.out.println("Prerando jamon y queso");
    }

    @Override
    public void agregarIngredientes() {
        System.out.println("Agregando jamon y queso");
    }
}
