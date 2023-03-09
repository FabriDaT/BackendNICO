package Clase15.DAO;

import Clase15.Model.Paciente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDaoH2 implements IDao<Paciente> {

    @Override
    public Paciente alta(Paciente paciente) throws SQLException {
        //necesito crear el objeto de la clase direccion daoh2 para poder dar el alta de la direccion del paciente, para luego cargarlo en la base de dato.
        DireccionDaoH2 direccionDaoH2 = new DireccionDaoH2();
        if (direccionDaoH2.buscar(paciente.getDireccion().getId()) == null){
            direccionDaoH2.alta(paciente.getDireccion());
        }
        Connection connection = conexion();

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PACIENTES (NOMBRE, APELLIDO, DNI, FECHA_INGRESO, DIRECCION) " +
                "VALUES(?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,paciente.getNombre());
        preparedStatement.setString(2,paciente.getApellido());
        preparedStatement.setString(3,paciente.getDni());
        preparedStatement.setString (4,paciente.getFechaIngreso());
        preparedStatement.setLong(5,paciente.getDireccion().getId());
        preparedStatement.execute();

        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        while (resultSet.next()){
            paciente.setId(resultSet.getLong(1));
        }
        preparedStatement.close();
        return paciente;
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = conexion();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM PACIENTES WHERE ID = ?");
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Paciente buscar(Long id) {
        Connection connection = conexion();
        Paciente pacienteEncontrado = null;
        DireccionDaoH2 buscarIdDireccion = new DireccionDaoH2();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT *  FROM PACIENTES WHERE ID = ?");
            preparedStatement.setLong(1,id);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                pacienteEncontrado = new Paciente(result.getString(2), result.getString(3),
                        result.getString(4),result.getString(5),
                        buscarIdDireccion.buscar(result.getLong(6)));
                pacienteEncontrado.setId(id);
            }
            preparedStatement.close();
            return pacienteEncontrado;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Paciente modificar(Long id) {
        return null;
    }

    @Override
    public List<Paciente> buscarTodos() {
        Connection connection = conexion();
        List<Paciente> pacientes = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT *  FROM PACIENTES");
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                pacientes.add(buscar(result.getLong(1)));
            }
            preparedStatement.close();
            return pacientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection conexion(){
            String DB_JDBC_DRIVER = "org.h2.Driver";
            //String DB_URL = "jdbc:h2:./Database/Integrador1";
            String DB_URL = "jdbc:h2:.;INIT=RUNSCRIPT FROM 'test.sql'";

            String DB_USER ="NicoA";
            String DB_PASSWORD = "123456";

            try {
                Class.forName(DB_JDBC_DRIVER);
                return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
    }
}

