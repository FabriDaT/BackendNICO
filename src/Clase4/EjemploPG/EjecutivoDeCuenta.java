package Clase4.EjemploPG;

public class EjecutivoDeCuenta extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(int monto) {
        if (monto < 60000){
            System.out.println("Se encarga de tramitarlo el Ejecutivo de Cuenta");
        } else if (getSigEmpleadoBanco() != null) {
            getSigEmpleadoBanco().procesarSolicitud(monto);
        }
    }

}
