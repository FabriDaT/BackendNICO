package Clase13.EjemploPGCompleto;

import java.sql.*;

public class Main {
    private static final String tableCreate = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario" +
            "(ID INT PRIMARY KEY, NOMBRE VARCHAR(255), " +
            "MAIL VARCHAR(255), SUELDO NUMERIC(15,2));";
    private static final String insert = "INSERT INTO Usuario (ID, NOMBRE, MAIL, SUELDO) VALUES (?,?,?,?);";
    private static final String update = "UPDATE Usuario SET SUELDO=? WHERE MAIL=?;";

    public static void main(String[] args) throws Exception{
        Usuario usuario = new Usuario("Nico", "amaya.niko@gmail.com", 350000);

        Connection connection = null;
        try {
            //creamos conexion
            connection = getConnection();

            //creamos statement para crear la tabla
            Statement statement = connection.createStatement();
            statement.execute(tableCreate);

            //creamos preparedStatementInsert para insertar valores a la tabla
            PreparedStatement preparedStatementInsert = connection.prepareStatement(insert);
            preparedStatementInsert.setInt(1,1);
            preparedStatementInsert.setString(2, usuario.getNombre());
            preparedStatementInsert.setString(3, usuario.getMail());
            preparedStatementInsert.setDouble(4, usuario.getSueldo());
            preparedStatementInsert.execute();

            //modificamos el commit de la conexion para enviar una actualizacion a la tabla
            connection.setAutoCommit(false);

            //creamos preparedStatatementUpdate para actualizar valores a la tabla
            PreparedStatement preparedStatementUpdate = connection.prepareStatement(update);
            preparedStatementUpdate.setDouble(1,usuario.subirSueldo(100000));
            preparedStatementUpdate.setString(2,usuario.getMail());
            preparedStatementUpdate.execute();
            connection.commit();
            //int test = 4/0;
            connection.setAutoCommit(true);

            String sql = "SELECT * FROM Usuario";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + "-" + resultSet.getString(2) +
                        "-" + resultSet.getString(3) + "-" + resultSet.getDouble(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:" +
                "./Database/Usuarios" , "NicoA" , "123456");
        return con;
    }

}
