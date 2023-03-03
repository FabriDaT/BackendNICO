package Clase12;

public class Empleado {
    private int id;
    private String nombre;
    private String matricula;
    private String telefono;
    private String direccion;

    public Empleado(int id , String nombre , String matricula , String telefono , String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String insert(){
        return "INSERT INTO Empleados VALUES ('" + getId() + "','" + getNombre() +
                "','" + getMatricula() + "','" + getTelefono() + "','" + getDireccion() + "');";
    }
    public String update(String columna, String dato, String id){
        return "UPDATE Empleados SET " + columna + " = '" + dato + "' WHERE ID = " + id + ";";
    }

    public String delete(String id){
        return "DELETE FROM Empleados WHERE ID = " + id + ";";
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
