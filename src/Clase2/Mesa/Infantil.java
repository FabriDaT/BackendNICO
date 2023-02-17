package Clase2.Mesa;

public class Infantil extends Menus{
    private int cantJuguetes;
    private double costoFinal;
    public Infantil(double precioBase, int cantJuguetes) {
        super(precioBase);
        this.cantJuguetes = cantJuguetes;
    }

    @Override
    public void armadoMenu() {
        System.out.println("Se esta armando un menu Infantil con: " + this.cantJuguetes + " juguetes");
    }

    @Override
    public void precio() {
        this.costoFinal = this.getPrecioBase() + (3 * this.cantJuguetes);
        System.out.println("El costo final del menu es de: $" + this.costoFinal);
    }
}
