package Clase15;

import Clase15.DAO.PacienteDaoH2;
import Clase15.Model.Direccion;
import Clase15.Model.Paciente;
import Clase15.Service.PacienteService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Direccion direccion = new Direccion("Cervantes", "564", "Rio Tercero", "Cordoba");
        Direccion direccion1 = new Direccion("Carriego", "137", "Rio Tercero", "Cordoba");

        Paciente paciente = new Paciente("Nicolas", "Amaya", "37897454", "15/10/2000" ,direccion);
        Paciente paciente1 = new Paciente("Greta", "Amaya", "50231879", "15/10/2020" ,direccion);
        Paciente paciente2 = new Paciente("Bruno", "Amaya", "40159357", "25/06/2022" ,direccion1);

        PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
        pacienteService.crearTabla();
        pacienteService.alta(paciente);
        pacienteService.alta(paciente1);
        pacienteService.alta(paciente2);
        System.out.println(pacienteService.buscarTodos());
    }
}
