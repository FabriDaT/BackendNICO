package Clase7.Clase;

public class Computadora {
    private int Ram;
    private int Disco;
    private String Id;
    private int Contador;

    public Computadora(int ram , int disco) {
        Ram = ram;
        Disco = disco;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getDisco() {
        return Disco;
    }

    public void setDisco(int disco) {
        Disco = disco;
    }

    public String getId() {
        return this.Ram + "-" + this.Disco;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int contador) {
        Contador = contador;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "Ram=" + Ram +
                ", Disco=" + Disco +
                ", Id='" + getId() + '\'' +
                ", Contador=" + getContador() +
                '}';
    }
}
