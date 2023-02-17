package Clase3.Mesa.Model;

public class Empleado extends Vendedores {
    private int antiguedad;

    public Empleado(String nombre, int antiguedad) {
        super(nombre);
        this.antiguedad = antiguedad;
    }
    @Override
    public void conseguirAfiliado(){
        setPuntos(getPuntos()+10);;
    };
    @Override
    public void vender(){
        setPuntos(getPuntos()+5);
    }


    @Override
    public void calcularCategoria() {
        if (getPuntos() < 20){
            setCategoria("Novato");
        } else if (getPuntos() < 30){
            setCategoria("Aprendiz");
        } else if (getPuntos() < 40){
            setCategoria("Bueno");
        } else {
            setCategoria("Maestro");
        }
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("La categoria de " + getNombre() + " es: " + getCategoria());
    }
}
