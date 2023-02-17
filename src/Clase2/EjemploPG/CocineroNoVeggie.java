package Clase2.EjemploPG;

public class CocineroNoVeggie extends Cocineros{
    @Override
    public void prepararIngredientes() {
        System.out.println("Preparando tomate y palmitos");
    }

    @Override
    public void agregarIngredientes() {
        System.out.println("Agregando tomate y palmitos");
    }
}
