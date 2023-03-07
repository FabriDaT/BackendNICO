package Clase15.Service;

import Clase15.DAO.IDao;
import Clase15.Model.Paciente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PacienteService {
    IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public IDao<Paciente> getPacienteIDao() {
        return pacienteIDao;
    }

    public void setPacienteIDao(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente alta(Paciente paciente) throws SQLException {
        return pacienteIDao.alta(paciente);
    }

    public void eliminar(Long id) {
    }

    public Paciente buscar(Long id) {
        return pacienteIDao.buscar(id);
    }

    public Paciente modificar(Long id) {
        return pacienteIDao.modificar(id);
    }

    public List<Paciente> buscarTodos() {
        return pacienteIDao.buscarTodos();
    }

    public void crearTabla() {
        String DB_JDBC_DRIVER = "org.h2.Driver";
        String DB_URL = "jdbc:h2:./Database/Integrador1";
        String DB_USER = "NicoA";
        String DB_PASSWORD = "123456";
        String TABLA_CREATE_PACIENTES = "DROP TABLE IF EXISTS PACIENTES; " +
                "CREATE TABLE PACIENTES" +
                "(ID BIGINT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(255), APELLIDO VARCHAR(255)," +
                "DNI VARCHAR(255), FECHA_INGRESO VARCHAR(255), DIRECCION BIGINT);";
        String TABLA_CREATE_DIRECCIONES = "DROP TABLE IF EXISTS DIRECCION; " +
                "CREATE TABLE DIRECCION" +
                "(ID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL, CALLE VARCHAR(255), NUMERO VARCHAR(255)," +
                "LOCALIDAD VARCHAR(255), PROVINCIA VARCHAR(255));";
        try {
            Class.forName(DB_JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL , DB_USER , DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute(TABLA_CREATE_PACIENTES);
            statement.execute(TABLA_CREATE_DIRECCIONES);
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
