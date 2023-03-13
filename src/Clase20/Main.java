package Clase20;

import Clase20.Entidades.Empleado;
import Clase20.Entidades.Empresa;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("20378974543", "Chancho Va");

        empresa.agregarEmpleado(new Empleado("Nico", "Amaya", "25049", 100000));
        empresa.agregarEmpleado(new Empleado("Agos", "Comello", "25050", 150000));
        empresa.agregarEmpleado(new Empleado("Bruno", "Martini", "25051", 200000));
        empresa.agregarEmpleado(new Empleado("Tati", "Amaya", "25052", 250000));

        try {
            //escribimos object
            FileOutputStream fileOutputStream = new FileOutputStream("Clase20.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(empresa);
            objectOutputStream.close();

            //leemos object
            FileInputStream fileInputStream = new FileInputStream("Clase20.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println(objectInputStream.readObject());
            objectInputStream.close();

            //escribimos con coma
            FileWriter fileWriter = new FileWriter("Clase20-1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(empresa.escribirComas(empresa.getEmpleados()));
            bufferedWriter.close();


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
