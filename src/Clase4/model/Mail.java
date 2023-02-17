package Clase4.model;

public class Mail {
    private String destinatarario;
    private String tema;

    public Mail(String destinatarario , String tema) {
        this.destinatarario = destinatarario;
        this.tema = tema;
    }

    public String getDestinatarario() {
        return destinatarario;
    }

    public void setDestinatarario(String destinatarario) {
        this.destinatarario = destinatarario;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
