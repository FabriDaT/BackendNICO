package Clase8.Mesa.Model;

public class Hotel {
    private String fechaSalida;
    private String fechaEntrada;
    private String cuidad;

    public Hotel(String fechaSalida , String fechaEntrada , String cuidad) {
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.cuidad = cuidad;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }
}
