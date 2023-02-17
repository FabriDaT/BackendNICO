package Clase2.Mesa;

public class Main {
    public static void main(String[] args){
        Menus menu1 = new Clasico(2000);
        menu1.armadoMenu();
        menu1.precio();

        Menus menu2 = new Infantil(2000, 5);
        menu2.armadoMenu();
        menu2.precio();

        Menus menu3 = new Vegetariano(2000, 2, 3);
        menu3.armadoMenu();
        menu3.precio();
    }
}
