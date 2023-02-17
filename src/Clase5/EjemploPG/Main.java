package Clase5.EjemploPG;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sitiosBloqueados = new ArrayList<>();
        sitiosBloqueados.add("youtube.com");
        sitiosBloqueados.add("google.com");
        IConexionInternet proxy = new ProxyInternet(new InternetService(), sitiosBloqueados);

        proxy.conectarCon("youtube.com");
        proxy.conectarCon("cronista.com");

    }
}
