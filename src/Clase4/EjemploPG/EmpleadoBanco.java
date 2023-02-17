package Clase4.EjemploPG;

public abstract class EmpleadoBanco {
    //la clase manejadora es la responsable de comenzar la cadena con ella,
    //en este caso, EmpleadoBanco
    private EmpleadoBanco sigEmpleadoBanco;
    public abstract void procesarSolicitud(int monto);

    public EmpleadoBanco getSigEmpleadoBanco() {
        return sigEmpleadoBanco;
    }

    public void setSigEmpleadoBanco(EmpleadoBanco sigEmpleadoBanco) {
        this.sigEmpleadoBanco = sigEmpleadoBanco;
    }
}
