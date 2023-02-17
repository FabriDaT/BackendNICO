package Clase4.Clase.service;

import Clase4.Clase.model.Mail;

public class Comercial extends Departamento{
    @Override
    public void enviar(Mail mail) {
        if (mail.getTema().equals("comercial@colmena.com") ||
                mail.getDestino().equals("Comercial")){
            System.out.println("Enviado a Comercial");
        } else if (getSigDepto() != null) {
            getSigDepto().enviar(mail);
        } else {
            System.out.println("SPAM");
        }
    }
}
