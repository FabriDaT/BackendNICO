package Clase19.Mesa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contactos> contactosList = new ArrayList<>();
        contactosList.add(new Contactos("Nico", "amaya.niko@gmail.com", "3571614642"));
        contactosList.add(new Contactos("Agos", "agocom93@gmail.com", "3571514892"));
        contactosList.add(new Contactos("Bruno", "brunoamaya33@gmail.com", "3571648945"));
        contactosList.add(new Contactos("Tati", "tatita@gmail.com", "35716148932"));
        contactosList.add(new Contactos("Sandra", "sandrita@gmail.com", "3571214596"));

        try {
            //Escribimos
            FileOutputStream fileOutputStream = new FileOutputStream("Contactos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contactosList);

            //Leemos
            FileInputStream fileInputStream = new FileInputStream("Contactos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object lectura = objectInputStream.readObject();
            System.out.println(lectura);

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
