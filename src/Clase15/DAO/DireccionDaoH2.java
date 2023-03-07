package Clase15.DAO;

import Clase15.Model.Direccion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DireccionDaoH2 implements IDao<Direccion> {

    @Override
    public Direccion alta(Direccion direccion) {
        Connection connection = conexion();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO DIRECCION (CALLE, NUMERO, LOCALIDAD, PROVINCIA) " +
                    "VALUES (?,?,?,?);" , Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1 , direccion.getCalle());
            preparedStatement.setString(2 , direccion.getNumero());
            preparedStatement.setString(3 , direccion.getLocalidad());
            preparedStatement.setString(4 , direccion.getProvincia());
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            while (resultSet.next()) {
                direccion.setId(resultSet.getLong(1));
            }
            preparedStatement.close();
            return direccion;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = conexion();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM DIRECCION WHERE ID = ?");
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Direccion buscar(Long id) {
        Connection connection = conexion();
        Direccion direccionEncontrada = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM DIRECCION WHERE id = ?");
            preparedStatement.setLong(1, id);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                direccionEncontrada = new Direccion(rs.getString(2) ,
                        rs.getString(3) , rs.getString(4) ,
                        rs.getString(5));
                direccionEncontrada.setId(id);
            }

            preparedStatement.close();
            return direccionEncontrada;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        @Override
        public Direccion modificar (Long id){
            return null;
        }

        @Override
        public List<Direccion> buscarTodos () {
            Connection connection = conexion();
            List<Direccion> direcciones = new ArrayList<>();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM DIRECCION");
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    direcciones.add(buscar(rs.getLong(1)));
                }
                preparedStatement.close();
                return direcciones;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        private Connection conexion () {
            String DB_JDBC_DRIVER = "org.h2.Driver";
            String DB_URL = "jdbc:h2:./Database/Integrador1";
            String DB_USER = "NicoA";
            String DB_PASSWORD = "123456";

            try {
                Class.forName(DB_JDBC_DRIVER);
                Connection connection = DriverManager.getConnection(DB_URL , DB_USER , DB_PASSWORD);

                return connection;
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


