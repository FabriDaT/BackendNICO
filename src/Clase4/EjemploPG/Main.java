package Clase4.EjemploPG;

public class Main {
    public static void main(String[] args) {
        EmpleadoBanco empleado1 = new EjecutivoDeCuenta();
        EmpleadoBanco empleado2 = new Director();
        EmpleadoBanco empleado3 = new Gerente();

        //aca es donde creamos la cadena
        empleado1.setSigEmpleadoBanco(empleado2);
        empleado2.setSigEmpleadoBanco(empleado3);

        System.out.println(empleado1.getSigEmpleadoBanco());
        System.out.println(empleado2.getSigEmpleadoBanco());

        empleado1.procesarSolicitud(150000);

    }

}
