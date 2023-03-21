package com.example.Clase24.controller;

import com.example.Clase24.dao.PacienteDaoH2;
import com.example.Clase24.model.Direccion;
import com.example.Clase24.model.Odontologo;
import com.example.Clase24.model.Paciente;
import com.example.Clase24.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController //se puede retornar cualquier tipo de datos
@Controller //solo devuelvo plantillas, no acepta otro tipo de return
public class Controlador {
    Odontologo odontologo = new Odontologo(25049, "Juan", "Baeza");
    Direccion direccion = new Direccion("Cervantes", "564", "Rio Tercero", "Cordoba");
    Paciente paciente = new Paciente("Nicolas", "Amaya", "37897454", "15/10/2000" ,direccion, odontologo);

    private final PacienteService pacienteService;
    @Autowired
    public Controlador(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
        pacienteService.setPacienteIdao(new PacienteDaoH2());
    }

    @GetMapping("/agregar") //FUNCIONA SOLO CON @CONTROLLER
    public String agregar(){
        Paciente pacienteAgregado = pacienteService.agregar(paciente);
        //aca le agrego al archivo index todo lo que quiero mostrar en pantalla.
        return "index";
    }
    @GetMapping("/index") //FUNCIONA SOLO CON @CONTROLLER
    public String welcome(Model model) {
    model.addAttribute("nombre", "pim pam pum");
    model.addAttribute("apellido", "pim pam pum");
    return "index";
    }
}
