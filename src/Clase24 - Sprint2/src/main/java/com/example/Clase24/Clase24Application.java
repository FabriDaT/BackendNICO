package com.example.Clase24;

import com.example.Clase24.dao.BaseDato;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase24Application {

	public static void main(String[] args) {
		BaseDato BBDD = new BaseDato();
		BBDD.crearTabla();

		SpringApplication.run(Clase24Application.class, args);
	}

}
