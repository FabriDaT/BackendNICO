package Clase2.Model;

public class EmpleadoEfectivo extends Empleado{
    private double sueldoBasico;
    private double premio;
    private double descuentos;

    public EmpleadoEfectivo(String nombre , String apellido , String numCuenta , double sueldoBasico , double premio , double descuentos) {
        super(nombre , apellido , numCuenta);
        this.sueldoBasico = sueldoBasico;
        this.premio = premio;
        this.descuentos = descuentos;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
}
