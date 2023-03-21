package com.example.Clase26.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class BaseDato {
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/BaseDatos";
    private final static String DB_USER = "nikoam";
    private final static String DB_PASSWORD = "123456";

    public void crearTabla() {
        String TABLA_CREATE_PACIENTES = "DROP TABLE IF EXISTS PACIENTES; " +
                "CREATE TABLE PACIENTES" +
                "(ID BIGINT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(255), APELLIDO VARCHAR(255)," +
                "DNI VARCHAR(255), FECHA_INGRESO VARCHAR(255), DIRECCION BIGINT, ODONTOLOGO BIGINT);";
        String TABLA_CREATE_DIRECCIONES = "DROP TABLE IF EXISTS DIRECCIONES; " +
                "CREATE TABLE DIRECCIONES" +
                "(ID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL, CALLE VARCHAR(255), NUMERO VARCHAR(255)," +
                "LOCALIDAD VARCHAR(255), PROVINCIA VARCHAR(255));";
        String TABLA_CREATE_ODONTOLOGO = "DROP TABLE IF EXISTS ODONTOLOGOS; " +
                "CREATE TABLE ODONTOLOGOS" +
                "(ID BIGINT PRIMARY KEY AUTO_INCREMENT, MATRICULA BIGINT," +
                "NOMBRE VARCHAR(255),APELLIDO VARCHAR(255));";
        try {
            Class.forName(DB_JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL , DB_USER , DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute(TABLA_CREATE_PACIENTES);
            statement.execute(TABLA_CREATE_DIRECCIONES);
            statement.execute(TABLA_CREATE_ODONTOLOGO);
            statement.close();
            connection.close();
            System.out.println("Base de datos creada con exito");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Connection connection(){
        try {
            Class.forName(DB_JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public String insert(String tabla){
        return switch (tabla) {
            case "PACIENTES" -> "INSERT INTO PACIENTES (NOMBRE, APELLIDO, DNI, FECHA_INGRESO, DIRECCION, ODONTOLOGO) VALUES(?,?,?,?,?,?);";
            case "DIRECCIONES" -> "INSERT INTO DIRECCIONES (CALLE, NUMERO, LOCALIDAD, PROVINCIA) VALUES (?,?,?,?);";
            case "ODONTOLOGOS" -> "INSERT INTO ODONTOLOGOS (MATRICULA, NOMBRE, APELLIDO) VALUES(?,?,?);";
            default -> "nombre de tabla incorrecta";
        };
    }
    public String delete(String tabla){
        return switch (tabla) {
            case "PACIENTES" -> "DELETE FROM PACIENTES WHERE ID = ?;";
            case "DIRECCIONES" -> "DELETE FROM DIRECCIONES WHERE ID = ?;";
            case "ODONTOLOGOS" -> "DELETE FROM ODONTOLOGOS WHERE ID= ?;";
            default -> "nombre de tabla o columna incorrecta";
        };
    }
    public String select(String tabla){
        return switch (tabla) {
            case "PACIENTES" -> "SELECT * FROM PACIENTES WHERE ID = ?;";
            case "DIRECCIONES" -> "SELECT * FROM DIRECCIONES WHERE ID = ?;";
            case "ODONTOLOGOS" -> "SELECT * FROM ODONTOLOGOS WHERE ID = ?;";
            default -> "nombre de tabla o columna incorrecta";
        };
    }
    public String selectAll(String tabla){
        return switch (tabla) {
            case "PACIENTES" -> "SELECT * FROM PACIENTES;";
            case "DIRECCIONES" -> "SELECT * FROM DIRECCIONES;";
            case "ODONTOLOGOS" -> "SELECT * FROM ODONTOLOGOS;";
            default -> "nombre de tabla incorrecta";
        };
    }
    public String update(String tabla){
        return switch (tabla){
            case "PACIENTES" -> "UPDATE PACIENTES SET NOMBRE = ?, APELLIDO = ?, DNI = ?, FECHA_INGRESO = ? WHERE ID = ?;";
            case "DIRECCIONES" -> "UPDATE DIRECCIONES SET CALLE = ?, NUMERO = ?, LOCALIDAD = ?, PROVINCIA = ? WHERE ID = ?;";
            case "ODONTOLOGOS" -> "UPDATE ODONTOLOGOS SET MATRICULA = ?, NOMBRE = ?, APELLIDO = ? WHERE ID = ?;";
            default -> "nombre de tabla incorrecta";
        };
    }
}
