package Clase2.Model;

public class EmpleadoContratado extends Empleado{
    private int horas;
    private double valorHora;

    public EmpleadoContratado(String nombre , String apellido , String numCuenta , int horas , double valorHora) {
        super(nombre , apellido , numCuenta);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
