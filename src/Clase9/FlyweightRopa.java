package Clase9;

import java.util.HashMap;

public class FlyweightRopa {
    private final HashMap<String, Ropa> ropaHashmap = new HashMap<>();
    private int contador;
    public FlyweightRopa() {
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<String, Ropa> getRopaHashmap() {
        return ropaHashmap;
    }

    public Ropa getRopa(String talle, String tipo, boolean esNuevo , boolean importada ){
        String key = talle + " - " + tipo + " - " + esNuevo + " - " + importada;
        Ropa ropaNueva = ropaHashmap.get(key);
        if (ropaNueva == null){
            ropaNueva = new Ropa(talle, tipo, esNuevo, importada);
            ropaHashmap.put(key, ropaNueva);
            this.contador++;
        }
        return ropaNueva;
    }

    @Override
    public String toString() {
        return "FlyweightRopa{" +
                "ropaHashmap=" + ropaHashmap +
                '}';
    }
}
