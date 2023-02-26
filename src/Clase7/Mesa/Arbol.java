package Clase7.Mesa;

public class Arbol {
    private int alto;
    private int ancho;
    private String color;
    private String tipoArbol;

    public Arbol(String color) {
        this.color = color;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getTipoArbol() {
        return tipoArbol;
    }

    public void setTipoArbol(String tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "Alto=" + getAlto() +
                ", Ancho=" + getAncho() +
                ", Color='" + color + '\'' +
                ", Tipo de Arbol='" + getTipoArbol() + '\'' +
                '}';
    }
}
