package Clase4.EjemploPG;

public class Gerente extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(int monto) {
        if (monto >= 200000){
            System.out.println("Se encarga de tramitarlo el Gerente");
        } else if (getSigEmpleadoBanco() != null) {
            getSigEmpleadoBanco().procesarSolicitud(monto);
        }
    }
}
