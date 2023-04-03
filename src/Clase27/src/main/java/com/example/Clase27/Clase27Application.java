package com.example.Clase27;

import com.example.Clase27.model.Direccion;
import com.example.Clase27.model.Odontologo;
import com.example.Clase27.model.Paciente;
import com.example.Clase27.model.Turno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Clase27Application {

	public static void main(String[] args) {
//		Odontologo odontologo = new Odontologo(25049, "Juan", "Baeza");
//		Direccion direccion = new Direccion("Cervantes", "564", "Rio Tercero", "Cordoba");
//		Paciente paciente = new Paciente("Nicolas", "Amaya", "37897454", "15/10/2000" ,direccion, odontologo)
//		Turno turno1 = new Turno(paciente, odontologo, "21/03/2003-15:00");
//		Turno turno2 = new Turno(paciente, odontologo, "03/12/2023-18:00");
//		List<Turno> listadoTurnos = new ArrayList<>();
//		listadoTurnos.add(turno1);
//		listadoTurnos.add(turno2);

		SpringApplication.run(Clase27Application.class, args);
	}

}
