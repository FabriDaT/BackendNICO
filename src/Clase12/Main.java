package Clase12;

import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Clase12.Main.class);

    public static void main(String[] args) throws Exception{
        try {
            //genero los objetos a cargar
            Empleado empleado1 = new Empleado(1, "Nico" , "23049" , "3571614642" , "Cervantes 564");
            Empleado empleado2 = new Empleado(2, "Agos" , "23050" , "3571544260" , "Peñaloza 314");
            Empleado empleado3 = new Empleado(3, "Bruno" , "23051" , "3571694258" , "Carriego 137");
            Empleado empleado4 = new Empleado(4, "Taty" , "23052" , "3571214596" , "Chazarreta 123");

            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:" +
                    "./Database/Empleados" , "NicoA" , "123456");

            Statement stmt = con.createStatement();

            String createSql = "DROP TABLE IF EXISTS Empleados;\n" +
                    "CREATE TABLE Empleados(ID INT PRIMARY KEY, NOMBRE VARCHAR(255), MATRICULA VARCHAR(255)," +
                    "TELEFONO VARCHAR(255), DIRECCION VARCHAR (255));";
            stmt.execute(createSql);

            String insertSql = empleado1.insert() + empleado2.insert() + empleado3.insert() + empleado4.insert();

            stmt.execute(insertSql);

            String updateSql = empleado2.update("TELEFONO", "3571528796", "2");
            empleado2.setTelefono("3571528796");
            stmt.execute(updateSql);
            logger.info("Empleado con id 2 modificado: " + empleado2.toString());

            String dropSql = empleado3.delete("3");
            stmt.execute(dropSql);
            logger.info("Empleado con id 3 eliminado: " + empleado3.toString());

            String test = "SELECT * FROM Empleados;";
            ResultSet rd = stmt.executeQuery(test);

            while (rd.next()) {
                System.out.println(rd.getString(1) + " - " +
                        rd.getString(2) + " - " +
                        rd.getString(3) + " - " +
                        rd.getString(4) + " - " +
                        rd.getString(5));
            }

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            if (e.getMessage().contains("ID")){
                logger.warn("ID repetidos!");
            }
            throw new RuntimeException(e);

        }
    }
}
