package Clase19.EjemploPG;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Yo", "Amaya", 37897454);
        try {
            //Escribimos el objeto en un archivo txt
            FileOutputStream fo = new FileOutputStream("Ejemplo PG Clase 19.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(persona);

            /*Recuperamos el objeto en un archivo*/
            FileInputStream fi = new FileInputStream("Ejemplo PG Clase 19.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            System.out.println(ois.readObject());
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
