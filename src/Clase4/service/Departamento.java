package Clase4.service;

import Clase4.model.Mail;

public abstract class Departamento {
    private Departamento sigDepto;

    public abstract void enviar(Mail mail);

    public Departamento getSigDepto() {
        return sigDepto;
    }

    public void setSigDepto(Departamento sigDepto) {
        this.sigDepto = sigDepto;
    }
}
