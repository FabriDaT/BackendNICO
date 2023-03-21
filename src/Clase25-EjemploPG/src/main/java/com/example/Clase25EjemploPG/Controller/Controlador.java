package com.example.Clase25EjemploPG.Controller;

import com.example.Clase25EjemploPG.DAO.IDao;
import com.example.Clase25EjemploPG.DAO.MedicamentoH2;
import com.example.Clase25EjemploPG.Model.Medicamento;
import com.example.Clase25EjemploPG.Service.MedicamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/medicamentos")//agrega medicamentos a la URL
public class Controlador {

    private MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoH2());
    @PostMapping("/guardar")
    public Medicamento guardar(@RequestBody Medicamento medicamento){ //requestbody es para que lea lo ue enviamos en el body
        return medicamentoService.guardar(medicamento);

    }
    @GetMapping("/buscar/{id}")
    public Medicamento buscar(@PathVariable("id") Long id){
        return medicamentoService.buscar(id);
    }
}
