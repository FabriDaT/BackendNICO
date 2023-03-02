package Clase11;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:" +
                    "./Database/Animales" , "NicoA" , "123456");
            //Nos conectamos
            Statement stmt = con.createStatement();

            //Código para crear una tabla. Elimina la tabla si esta ya existe y la
            //vuelve a crear
            String createSql = "DROP TABLE IF EXISTS Animales;\n" +
                    "CREATE TABLE Animales(ID INT PRIMARY KEY, TIPO VARCHAR(255), NOMBRE VARCHAR(255));";
            String createSql2 = "INSERT INTO Animales VALUES(1, 'Perro', 'colita');\n" +
                    "INSERT INTO Animales VALUES(2, 'Perro', 'beto');\n" +
                    "INSERT INTO Animales VALUES(3, 'Gato', 'coti');\n" +
                    "INSERT INTO Animales VALUES(4, 'Loro', 'nico');\n" +
                    "INSERT INTO Animales VALUES(5, 'Tortuga', 'locura');";
            String dropSql = "DELETE FROM Animales WHERE ID = 3;";

            stmt.execute(createSql);
            stmt.execute(createSql2);
            stmt.execute(dropSql);

            //Codigo para consultar todos los registros de la tabla TEST
            String sql = "select * from Animales";
            ResultSet rd = stmt.executeQuery(sql);

            //Código para recorrer el resultado de la consulta
            while (rd.next()) {
                System.out.println(rd.getInt(1) + rd.getString(2) + rd.getString(3));
            }
            con.close();
    } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {

        }
    }
}


