package Clase4.Clase.service;

import Clase4.Clase.model.Mail;

public class Tecnico extends Departamento{
    @Override
    public void enviar(Mail mail) {
        if (mail.getDestino().equals("tecnica@colmena.com") ||
                mail.getTema().equals("Tecnico")){
            System.out.println("Enviado a Tecnico");
        } else if (getSigDepto() != null) {
            getSigDepto().enviar(mail);
        } else {
            System.out.println("SPAM");
        }
    }
}
