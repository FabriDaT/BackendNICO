package com.example.Clase25Mesa;

import com.example.Clase25Mesa.dao.BaseDato;
import com.example.Clase25Mesa.dao.PacienteDaoH2;
import com.example.Clase25Mesa.model.Direccion;
import com.example.Clase25Mesa.model.Odontologo;
import com.example.Clase25Mesa.model.Paciente;
import com.example.Clase25Mesa.service.PacienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase25MesaApplication {

	public static void main(String[] args) {
		BaseDato bbdd = new BaseDato();
		//bbdd.crearTabla();
		Odontologo odontologo = new Odontologo(25049, "Juan", "Baeza");
		Direccion direccion = new Direccion("Cervantes", "564", "Rio Tercero", "Cordoba");
		Paciente paciente = new Paciente("Nicolas", "Amaya", "37897454", "15/10/2000" ,direccion, odontologo);
		PacienteService pacienteService = new PacienteService();
		pacienteService.setPacienteIdao(new PacienteDaoH2());
		pacienteService.agregar(paciente);

		SpringApplication.run(Clase25MesaApplication.class, args);
	}

}
