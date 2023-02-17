package Clase2.EjemploPG;

public abstract class Cocineros {
    public void hacerPizza(){
        preparaMasa();
        preCocinarMasa();
        cocinarPizza();
        empaquetarPizza();
    };
    public void preparaMasa(){
        System.out.println("Preparando Masa");
    };
    public void preCocinarMasa(){
        System.out.println("Precocinando Masa");

    };
    public void cocinarPizza(){
        System.out.println("Cocinando Masa");

    };
    public void empaquetarPizza(){
        System.out.println("Empaquetando Masa");

    };

    public abstract void prepararIngredientes();
    public abstract void agregarIngredientes();

}
