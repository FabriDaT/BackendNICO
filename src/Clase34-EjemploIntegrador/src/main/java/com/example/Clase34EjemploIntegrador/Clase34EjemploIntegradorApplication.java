package com.example.Clase34EjemploIntegrador;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.introspector.Property;

@SpringBootApplication
public class Clase34EjemploIntegradorApplication {

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(Clase34EjemploIntegradorApplication.class, args);
	}

}
