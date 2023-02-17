package Clase5.EjemploPG;

import java.util.List;

public class ProxyInternet implements IConexionInternet {
    //    El proxy realiza lo mismo que el servicio Internet, pero le agregamos lógica
//    extra, en este caso, comprobaremos si la dirección a la que nos queremos conectar
//    está en la lista de sitios bloqueados, si no está, nos conectamos.
    private InternetService internetService;
    private List<String> sitiosBloqueados;

    public ProxyInternet(InternetService internetService , List<String> sitiosBloqueados) {
        this.internetService = internetService;
        this.sitiosBloqueados = sitiosBloqueados;
    }

    @Override
    public void conectarCon(String url) {
        if (!this.sitiosBloqueados.contains(url)){
            this.internetService.conectarCon(url);
        } else {
            System.out.println("Sitio bloqueado");
        }
    }
}

