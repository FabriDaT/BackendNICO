package Clase4.service;

import Clase4.model.Mail;

public class Gerencia extends Departamento{

    @Override
    public void enviar(Mail mail) {
        if ("gerencia@colmena.com".equals(mail.getDestinatarario()) ||
            "Gerencia".equalsIgnoreCase(mail.getTema())){
            System.out.println("Enviado a Gerencia");
        }
        else{
            getSigDepto().enviar(mail);
        }
    }
}
