package com.example.Clase27.controller;

import com.example.Clase27.model.Turno;
import com.example.Clase27.service.TurnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/turno")
public class ControllerTurno {
//    private final TurnoService turnoService;
//    @Autowired
//    public ControllerTurno(TurnoService turnoService) {
//        this.turnoService = turnoService;
//        turnoService.setTurnoIdao(new TurnoLocal());
//    }
    private final TurnoService turnoService = new TurnoService();

//    @GetMapping("/buscar/{id}")
//    public Turno buscarTurno(@PathVariable("id") Long id){
//        return turnoService.listar(id);
//    }
    @GetMapping("/listartodos")
    public List<Turno> listarTodosTurno(){
        return turnoService.listarTodos();
    }

    @PostMapping("/agregar/{fechaTurno}")
    public Turno agregarTurno(@PathVariable ("fechaTurno") String fechaTurno) {
        return turnoService.agregar(fechaTurno);
    }
//    @PutMapping("/modificar/{id}")
//    public Turno modificarTurno(@PathVariable ("id") long id, @RequestBody Turno turno){
//        return turnoService.modificar(id, turno);
//    }
//    @DeleteMapping("/eliminar/{id}")
//    public void eliminarTurno(@PathVariable ("id") Long id){
//        turnoService.eliminar(id);
//    }

}
