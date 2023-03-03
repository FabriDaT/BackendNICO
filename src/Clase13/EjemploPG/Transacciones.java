package Clase13.EjemploPG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
         /*
    Para iniciar una transacción deshabilitamos el modo auto-commit mediante el
método setAutoCommit(false). Esto nos da el control sobre lo que se realiza y
cuándo se realiza.
Una llamada al método commit() realizará todas las instrucciones emitidas desde la
última vez que se invocó el método commit().
Una llamada a rollback() deshará todos los cambios realizados desde el último
commit(). Una vez se ha emitido una instrucción commit(), esas transacciones no
pueden deshacerse con rollback().
     */

        Connection con = null;
        try {

            Class.forName("org.h2.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:h2:" +
                    "./Database/Empleados" , "NicoA" , "123456");
            con.setAutoCommit(false);

            //s.executeUpdate("INSERT INTO RESERVAS(pasajero, origen, destino) VALUES('Felipe', 'Alicante', 'Madrid')");

            // s.executeUpdate("INSERT INTO RESERVAS(pasajero, origen, destino) VALUES ('Felipe', 'Madrid', 'Dubai')");

            // s.executeUpdate("INSERT INTO RESERVAS(pasajero, origen, destino) VALUES('Felipe', 'Dubai', 'Sydney')");

            con.commit();

        } catch (SQLException e) {
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
