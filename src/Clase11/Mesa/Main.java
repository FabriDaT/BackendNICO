package Clase11.Mesa;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:" +
                    "./Database/Figuras" , "NicoA" , "123456");
            Statement stmt = con.createStatement();
            String createSql = "DROP TABLE IF EXISTS Figuras;\n" +
                    "CREATE TABLE Figuras(ID INT PRIMARY KEY, FIGURA VARCHAR(255), COLOR VARCHAR(255));";
            stmt.execute(createSql);
            String insertSql = "INSERT INTO Figuras VALUES (1, 'Circulo', 'Rojo');" +
                    "INSERT INTO Figuras VALUES (2, 'Circulo', 'Rojo');" +
                    "INSERT INTO Figuras VALUES (3, 'Cuadrado', 'Marron');" +
                    "INSERT INTO Figuras VALUES (4, 'Cuadrado', 'Azul');" +
                    "INSERT INTO Figuras VALUES (5, 'Cuadrado', 'Negro');";
            stmt.execute(insertSql);

            String sql = "SELECT * FROM Figuras WHERE COLOR = 'Rojo';";
            ResultSet rd = stmt.executeQuery(sql);

            while (rd.next()) {
                System.out.println(rd.getString(1) + " - " + rd.getString(2) + " - " + rd.getString(3) );
            }

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
