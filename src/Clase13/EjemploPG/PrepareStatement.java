package Clase13.EjemploPG;

import java.sql.*;

public class PrepareStatement {
    public static void main(String[] args) {
        //Para ello debemos preparar una query y agregarle el símbolo ? donde vamos a reemplazar el dato.
        // El método executeUpdate() devuelve un entero indicando el número de filas
        // afectadas por la modificación. Por ejemplo:
        //UPDATE PERSONAS SET NOMBRE=? WHERE APELLIDO=?


        //UTILIZO LA BASE DE DATOS DE EMPLEADOS CLASE ANTERIOR
        try {

            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:" +
                    "./Database/Empleados" , "NicoA" , "123456");

            //UPDATE
            String query = ("UPDATE Empleados SET NOMBRE=? WHERE MATRICULA=?");
            PreparedStatement psStmt = con.prepareStatement(query);
            psStmt.setString(1, "Mariano");
            psStmt.setString(2, "23049");
            psStmt.executeUpdate();

            //INSERT
            String query1 = ("INSERT INTO Empleados (ID, NOMBRE) VALUES (?,?)");
            PreparedStatement psStmt1 = con.prepareStatement(query1);
            psStmt1.setString(1, "5");
            psStmt1.setString(2, "Test PreparedStatment");
            psStmt1.executeUpdate();

            //DELETE
            String query2 = ("DELETE FROM Empleados WHERE NOMBRE=?");
            PreparedStatement psStmt2 = con.prepareStatement(query2);
            psStmt2.setString(1, "Mariano");
            psStmt2.executeUpdate();


        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
