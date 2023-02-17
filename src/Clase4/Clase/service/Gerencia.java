package Clase4.Clase.service;

import Clase4.Clase.model.Mail;

public class Gerencia extends Departamento{

    @Override
    public void enviar(Mail mail) {
        if ("gerencia@colmena.com".equals(mail.getDestino()) ||
            "Gerencia".equalsIgnoreCase(mail.getTema())){
            System.out.println("Enviado a Gerencia");
        }
        else if (getSigDepto() != null) {
            getSigDepto().enviar(mail);
        } else {
            System.out.println("SPAM");
        }
    }
}
