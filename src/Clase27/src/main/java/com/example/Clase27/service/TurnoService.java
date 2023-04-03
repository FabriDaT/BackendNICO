package com.example.Clase27.service;

import com.example.Clase27.Repository.PacienteDaoH2;
import com.example.Clase27.model.Direccion;
import com.example.Clase27.model.Odontologo;
import com.example.Clase27.model.Paciente;
import com.example.Clase27.model.Turno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TurnoService {

    private List<Turno> listadoTurnos = new ArrayList<>();

    public TurnoService() {

    }

//solo para la clase 27

    public Turno agregar(String fechaTurno) {
        Odontologo odontologo = new Odontologo(25049, "Juan", "Baeza");
		Direccion direccion = new Direccion("Cervantes", "564", "Rio Tercero", "Cordoba");
		Paciente paciente = new Paciente("Nicolas", "Amaya", "37897454", "15/10/2000" ,direccion, odontologo);
        Turno turno1 = new Turno(paciente, odontologo, fechaTurno);
        listadoTurnos.add(turno1);
        return turno1;
        }

    public void eliminar(String fechaTurno) {
        for (Turno t:listadoTurnos) {
            if (t.getFechaHora().equals(fechaTurno)){
                listadoTurnos.remove(t);
            }
        }
    }

    public List<Turno> listarTodos() {
        return this.listadoTurnos;
    }

    public Turno listar(String fechaTurno) {
        Turno turnoEncontrado = null;
        for (Turno t : listadoTurnos) {
            if (t.getFechaHora().equals(fechaTurno)) {
                turnoEncontrado = t;
            }
        }
        return turnoEncontrado;
    }

//    public Turno modificar(Long id , Turno turno) {
//        return turnoIdao.modificar(id, turno);
//    }

}
