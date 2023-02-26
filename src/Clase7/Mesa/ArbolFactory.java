package Clase7.Mesa;

import java.util.HashMap;

public class ArbolFactory {
    private final HashMap<String, Arbol> arbolHashMap = new HashMap<>();

    public Arbol getArbolHash(String color){
        Arbol arbolNuevo = arbolHashMap.get(color);
        if (arbolNuevo == null){
            arbolNuevo = new Arbol(color);
            seteoCaracteristicas(color, arbolNuevo);
            arbolHashMap.put(color, arbolNuevo);
        }
        return arbolNuevo;
    }

    private void seteoCaracteristicas(String color, Arbol arbolNuevo){
        switch (color){
            case "verde":
                arbolNuevo.setTipoArbol("Ornamentales");
                arbolNuevo.setAlto(200);
                arbolNuevo.setAncho(400);
                break;
            case "rojo":
                arbolNuevo.setTipoArbol("Frutales");
                arbolNuevo.setAlto(500);
                arbolNuevo.setAncho(300);
                break;
            case "celeste":
                arbolNuevo.setTipoArbol("Florales");
                arbolNuevo.setAlto(100);
                arbolNuevo.setAncho(200);
                break;
        }
    }

}
