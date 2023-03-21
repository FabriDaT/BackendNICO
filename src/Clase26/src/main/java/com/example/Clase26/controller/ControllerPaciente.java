package com.example.Clase26.controller;

import com.example.Clase26.dao.PacienteDaoH2;
import com.example.Clase26.model.Odontologo;
import com.example.Clase26.model.Paciente;

import com.example.Clase26.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //se puede retornar cualquier tipo de datos
@RequestMapping("/paciente")
//@Controller //solo devuelvo plantillas, no acepta otro tipo de return
public class ControllerPaciente {
    private final PacienteService pacienteService;
    @Autowired

    public ControllerPaciente(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
        pacienteService.setPacienteIdao(new PacienteDaoH2());
    }
    @GetMapping("/buscar/{id}")
    public Paciente buscarPaciente(@PathVariable ("id") Long id){
        return pacienteService.listar(id);
    }
    @GetMapping("/listartodos")
    public List<Paciente> listarTodosPacientes(){
        return pacienteService.listarTodos();
    }
    @PostMapping("/agregar")
    public Paciente agregarPaciente(@RequestBody Paciente paciente){
        return pacienteService.agregar(paciente);
    }
    @PutMapping("/modificar/{id}")
    public Paciente modificarOdontologo(@PathVariable ("id") long id, @RequestBody Paciente paciente){
        return pacienteService.modificar(id, paciente);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPaciente(@PathVariable ("id") Long id){
        pacienteService.eliminar(id);
    }


//    @GetMapping("/index") //FUNCIONA SOLO CON @CONTROLLER
//    public String welcome(Model model) {
//    model.addAttribute("nombre", "pim pam pum");
//    model.addAttribute("apellido", "pim pam pum");
//    return "index";
//    }
}
