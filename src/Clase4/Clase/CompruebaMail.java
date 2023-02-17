package Clase4.Clase;

import Clase4.Clase.model.Mail;
import Clase4.Clase.service.Comercial;
import Clase4.Clase.service.Departamento;
import Clase4.Clase.service.Gerencia;
import Clase4.Clase.service.Tecnico;

public class CompruebaMail {
    public static void main(String[] args) {
        Mail pruebaMail = new Mail("gerencia@colmena.com", "Gerencia");
        Mail pruebaMail2 = new Mail("tecnica@colmena.com", "Tecnico");
        Mail pruebaMail3 = new Mail("comerciall@colmena.com", "Tecnicoo");

        Departamento gerencia = new Gerencia();
        Departamento comercial = new Comercial();
        Departamento tecnico = new Tecnico();

        gerencia.setSigDepto(comercial);
        comercial.setSigDepto(tecnico);

        gerencia.enviar(pruebaMail);
        comercial.enviar(pruebaMail);
        comercial.enviar(pruebaMail2);
        tecnico.enviar(pruebaMail3);
    }
}
