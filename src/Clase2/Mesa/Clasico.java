package Clase2.Mesa;

public class Clasico extends Menus{

    public Clasico(double precioBase) {
        super(precioBase);
    }

    @Override
    public void armadoMenu() {
        System.out.println("Se esta armando un menu Clasico");
    }

    @Override
    public void precio() {
        System.out.println("El costo final del menu es de: " + this.getPrecioBase());
    }
}
