package Clase3.Mesa;

import Clase3.Mesa.Model.Afiliado;
import Clase3.Mesa.Model.Empleado;
import Clase3.Mesa.Model.Vendedores;

public class Main {
    public static void main(String[] args) {
        Vendedores afiliado1 = new Afiliado("Nico");
        Vendedores empleado1 = new Empleado("Agos", 3);
        Vendedores empleado2 = new Empleado("Bruno", 20);

        afiliado1.vender();
        afiliado1.vender();
        afiliado1.calcularCategoria();
        afiliado1.mostrarCategoria();

        empleado1.vender();
        empleado1.conseguirAfiliado();
        empleado1.conseguirAfiliado();
        empleado1.calcularCategoria();
        empleado1.mostrarCategoria();
    }
}
