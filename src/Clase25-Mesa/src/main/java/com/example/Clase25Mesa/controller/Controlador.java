package com.example.Clase25Mesa.controller;

import com.example.Clase25Mesa.dao.DireccionDaoH2;
import com.example.Clase25Mesa.dao.OdontologoDaoH2;
import com.example.Clase25Mesa.dao.PacienteDaoH2;
import com.example.Clase25Mesa.model.Direccion;
import com.example.Clase25Mesa.model.Odontologo;
import com.example.Clase25Mesa.model.Paciente;
import com.example.Clase25Mesa.service.DireccionService;
import com.example.Clase25Mesa.service.OdontologoService;
import com.example.Clase25Mesa.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //se puede retornar cualquier tipo de datos
//@Controller //solo devuelvo plantillas, no acepta otro tipo de return
public class Controlador {

    private final PacienteService pacienteService;
    private final OdontologoService odontologoService;
    private final DireccionService direccionService;
    @Autowired
    public Controlador(PacienteService pacienteService, OdontologoService odontologoService, DireccionService direccionService) {
        this.pacienteService = pacienteService;
        pacienteService.setPacienteIdao(new PacienteDaoH2());
        this.odontologoService = odontologoService;
        odontologoService.setOdontologoIDao(new OdontologoDaoH2());
        this.direccionService = direccionService;
        direccionService.setDireccionIdao(new DireccionDaoH2());
    }

    @GetMapping("/paciente/buscar/{id}")
    public Paciente buscar(@PathVariable ("id") Long id){
        return pacienteService.listar(id);
    }

    @DeleteMapping("/paciente/eliminar/{id}")
    public void elimina(@PathVariable ("id") Long id){
        pacienteService.eliminar(id);
    }

    @GetMapping("/pacientes")
    public List<Paciente> listarTodos(){
        return pacienteService.listarTodos();
    }



//    @GetMapping("/index") //FUNCIONA SOLO CON @CONTROLLER
//    public String welcome(Model model) {
//    model.addAttribute("nombre", "pim pam pum");
//    model.addAttribute("apellido", "pim pam pum");
//    return "index";
//    }
}
