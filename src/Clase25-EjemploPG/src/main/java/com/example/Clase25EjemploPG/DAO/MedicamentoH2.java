package com.example.Clase25EjemploPG.DAO;

import com.example.Clase25EjemploPG.Model.Medicamento;

import java.sql.*;
import java.util.List;

public class MedicamentoH2 implements IDao<Medicamento> {
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/Medicamentos";
    private final static String DB_USER ="NicoA";
    private final static String DB_PASSWORD = "123456";
    private static final String TABLA_CREATE = "DROP TABLE IF EXISTS MEDICAMENTOS; " +
            "CREATE TABLE MEDICAMENTOS" +
            "(ID BIGINT PRIMARY KEY, CODIGO_NUMERICO BIGINT, NOMBRE VARCHAR(255)," +
            "LABORATORIO_PRODUCTOR VARCHAR(255), CANTIDAD INT, PRECIO NUMERIC(15,2));";

    @Override
    public void crearTabla() {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();
            statement.execute(TABLA_CREATE);
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Medicamento guardar(Medicamento medicamento) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("INSERT INTO Medicamentos VALUES(?,?,?,?,?,?);");
            preparedStatement.setLong(1,medicamento.getId());
            preparedStatement.setLong(2,medicamento.getCodigoNumerico());
            preparedStatement.setString(3,medicamento.getNombre());
            preparedStatement.setString(4,medicamento.getLaboratorioProductor());
            preparedStatement.setInt(5,medicamento.getCantidad());
            preparedStatement.setDouble(6,medicamento.getPrecio());
            preparedStatement.execute();

            preparedStatement.close();

        return medicamento;
    } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
        @Override
    public void eliminar(Long id) {

    }

    @Override
    public Medicamento buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Medicamento medicamento = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM MEDICAMENTOS WHERE id = ?");
            preparedStatement.setLong(1,id);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                medicamento = new Medicamento(id, rs.getLong(2),
                        rs.getString(3),rs.getString(4),
                        rs.getInt(5),rs.getDouble(6));
            }

            preparedStatement.close();
        return medicamento;
    } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

}

    @Override
    public List<Medicamento> buscarTodos() {
        return null;
    }
}