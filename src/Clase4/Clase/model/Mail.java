package Clase4.Clase.model;

public class Mail {
    private String destino;
    private String tema;

    public Mail(String destino , String tema) {
        this.destino = destino;
        this.tema = tema;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
