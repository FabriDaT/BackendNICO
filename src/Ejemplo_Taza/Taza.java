package Ejemplo_Taza;

public class Taza {
    private String tipoLiquido;
    private double porcentaje;

    public Taza(String tipoLiquido , double porcentaje) {
        this.tipoLiquido = tipoLiquido;
        this.porcentaje = porcentaje;
    }

    public String getTipoLiquido() {
        return tipoLiquido;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
