package Clase19.Clase;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creo y grabo los perros en una array
        List<Perro> perros = new ArrayList<>();
        Perro perro1 = new Perro("Colita", 3);
        Perro perro2 = new Perro("Beto", 5);
        perros.add(perro1);
        perros.add(perro2);
        perros.add(new Perro("Indio", 2));

        try {
            FileOutputStream fos = new FileOutputStream("Listado de perros.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(perros);

            oos.close();
            FileInputStream fis = new FileInputStream("Listado de perros.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object lectura = ois.readObject();
            System.out.println(lectura);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
