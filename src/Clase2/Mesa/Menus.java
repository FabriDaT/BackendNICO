package Clase2.Mesa;

public abstract class Menus {
    private double precioBase;

    public Menus(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setPrecioBase(double monto) {
        this.precioBase = monto;
    }

    public double getPrecioBase(){
        return this.precioBase;
    };

    public abstract void armadoMenu();
    public abstract void precio();
}
