package com.example.Clase25EjemploPG;

import com.example.Clase25EjemploPG.DAO.MedicamentoH2;
import com.example.Clase25EjemploPG.Model.Medicamento;
import com.example.Clase25EjemploPG.Service.MedicamentoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase25EjemploPgApplication {

	public static void main(String[] args) {
		MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoH2());
		medicamentoService.crearTabla();

		Medicamento medicamento = new Medicamento(1, 123, "Tafirol", "Cabecitas", 10,100.0);
		medicamentoService.guardar(medicamento);

		SpringApplication.run(Clase25EjemploPgApplication.class, args);
	}

}
