package com.example.Clase26;

import com.example.Clase26.dao.BaseDato;
import com.example.Clase26.dao.PacienteDaoH2;
import com.example.Clase26.model.Direccion;
import com.example.Clase26.model.Odontologo;
import com.example.Clase26.model.Paciente;
import com.example.Clase26.service.PacienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase26Application {

	public static void main(String[] args) {
		BaseDato bbdd = new BaseDato();
		//bbdd.crearTabla();
		Odontologo odontologo = new Odontologo(25049, "Juan", "Baeza");
		Direccion direccion = new Direccion("Cervantes", "564", "Rio Tercero", "Cordoba");
		Paciente paciente = new Paciente("Nicolas", "Amaya", "37897454", "15/10/2000" ,direccion, odontologo);
		PacienteService pacienteService = new PacienteService();
		pacienteService.setPacienteIdao(new PacienteDaoH2());
		pacienteService.agregar(paciente);
		SpringApplication.run(Clase26Application.class, args);
	}

}
