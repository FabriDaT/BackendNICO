package Clase4.EjemploPG;

public class Director extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(int monto) {
        if (monto >= 60000 && monto < 200000){
            System.out.println("Se encarga de tramitarlo el Director");
        } else if (getSigEmpleadoBanco() != null) {
            getSigEmpleadoBanco().procesarSolicitud(monto);
        }
    }
}
