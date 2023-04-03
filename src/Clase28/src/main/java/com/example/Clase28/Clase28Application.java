package com.example.Clase28;

import com.example.Clase28.model.Direccion;
import com.example.Clase28.model.Odontologo;
import com.example.Clase28.model.Paciente;
import com.example.Clase28.model.Turno;
import com.example.Clase28.repository.implement.TurnoDaoH2;
import com.example.Clase28.service.BaseDato;
import com.example.Clase28.service.TurnoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase28Application {

	public static void main(String[] args) {
//		BaseDato bbdd = new BaseDato();
//		//bbdd.crearTabla();
//		Turno turno = new Turno(new Paciente("nico", "amaya", "37897454","15/10/2000",
//								new Direccion("Cervantes","564","Rio Tercero","Cordoba")),
//								new Odontologo(25049L,"Juan","Baeza"), "15-10-2023-15:00");
//
//		Paciente paciente = new Paciente("nico", "amaya", "37897454","15/10/2000",
//				new Direccion("Cervantes","564","Rio Tercero","Cordoba"));

//		TurnoService turnoService = new TurnoService();
//		turnoService.setTurnoIdao(new TurnoDaoH2());
//		turnoService.agregar(turno);

		//System.out.println(turno);
		SpringApplication.run(Clase28Application.class, args);
	}

}
