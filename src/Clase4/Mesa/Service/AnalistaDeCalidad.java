package Clase4.Mesa.Service;

import Clase4.Mesa.Model.Articulo;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad sigAnalisis;

    public abstract void control(Articulo articulo);
    public AnalistaDeCalidad getSigAnalisis() {
        return sigAnalisis;
    }

    public void setSigAnalisis(AnalistaDeCalidad sigAnalisis) {
        this.sigAnalisis = sigAnalisis;
    }
}
