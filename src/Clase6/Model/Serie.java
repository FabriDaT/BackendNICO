package Clase6.Model;

public class Serie{
    private int cantVistasSerie;
    private String nombreSerie;

    public Serie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public int getCantVistasSerie() {
        return cantVistasSerie;
    }

    public void setCantVistasSerie(int cantVistasSerie) {
        this.cantVistasSerie = cantVistasSerie;
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }
}
