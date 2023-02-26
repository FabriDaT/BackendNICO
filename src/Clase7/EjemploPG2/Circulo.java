package Clase7.EjemploPG2;

public class Circulo {
    private String color;
    private double radio;
    private String tamanio;

    public Circulo(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "color='" + color + '\'' +
                ", radio=" + radio +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
