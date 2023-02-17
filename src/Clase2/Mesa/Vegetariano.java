package Clase2.Mesa;

public class Vegetariano extends Menus {

    private int cantEspecias;
    private int cantSalsaVegetarianas;
    private double costoFinal;

    public Vegetariano(double precioBase, int cantEspecias, int cantSalsaVegetarianas) {
        super(precioBase);
        this.cantEspecias = cantEspecias;
        this.cantSalsaVegetarianas = cantSalsaVegetarianas;
    }


    @Override
    public void armadoMenu() {
        System.out.println("Se esta armando un menu Vegetariano con: " + this.cantEspecias +
                " especias y " + this.cantSalsaVegetarianas + " salsas vegetarianas");

    }

    @Override
    public void precio() {
        this.costoFinal = getPrecioBase() + (this.cantSalsaVegetarianas * 2) * (1 + (this.cantEspecias / 100));
        System.out.println("El costo final del menu es de: $" + this.costoFinal);
    }
}
