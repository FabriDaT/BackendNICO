package Clase3.Mesa.Model;

public class Afiliado extends Vendedores {

    private String categoria;
    private int puntos;

    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    public void vender(){
        setPuntos(getPuntos()+15);
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
