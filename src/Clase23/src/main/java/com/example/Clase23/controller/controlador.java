package com.example.Clase23.controller;

import com.example.Clase23.model.Odontologo;
import com.example.Clase23.model.Paciente;
import com.example.Clase23.service.OdontologoService;
import com.example.Clase23.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class controlador {
    private final PacienteService pacienteService;
    private final OdontologoService odontologoService;
    @Autowired
    public controlador(PacienteService pacienteService , OdontologoService odontologoService) {
        this.pacienteService = pacienteService;
        this.odontologoService = odontologoService;
    }

    @GetMapping("/paciente/listarTodos")
    public List<Paciente> listarPacientes() {
        return pacienteService.crearTodos();
    }
    @GetMapping("/odontologo/listarTodos")
    public List<Odontologo> listarOdontologos() {
        return odontologoService.crearTodos();
    }


    @GetMapping(path = "/buscarmail")
    public String buscarPaciente(Model model, @RequestParam String mail) {
        String mensaje = "index";
        Paciente paciente = pacienteService.buscar(mail);
        if (paciente == null){
            mensaje = "Paciente no encontrado por mail" + mail;
        }else {
            model.addAttribute("nombre", paciente.getNombre());
            model.addAttribute("apellido", paciente.getApellido());
        }
        System.out.println(paciente);
        return mensaje;
    }

    @GetMapping(path = "/buscarmatricula")
    public String buscar(Model model, @RequestParam String matricula) {
        String mensaje = "index";
        Odontologo odontologo = odontologoService.buscar(matricula);
        if (odontologo == null){
            mensaje = "Odontólogo no encontrado por matricula" + matricula;
        }else {
            model.addAttribute("matricula", odontologo.getMatricula());
        }
        System.out.println(odontologo);
        return mensaje;
    }

//    @GetMapping("/index")
//    public String welcome(Model model) {
//        model.addAttribute("nombre", "pim pam pum");
//        model.addAttribute("apellido", "pim pam pum");
//
//        return "index";
//    }

}
