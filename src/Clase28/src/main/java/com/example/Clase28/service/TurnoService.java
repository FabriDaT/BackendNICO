package com.example.Clase28.service;

import com.example.Clase28.model.Odontologo;
import com.example.Clase28.model.Turno;
import com.example.Clase28.repository.Idao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {

    private Idao<Turno> turnoIdao;

    public void setTurnoIdao(Idao<Turno> turnoIdao) {
        this.turnoIdao = turnoIdao;
    }

    public Turno agregar(Turno turno) {
        return turnoIdao.agregar(turno);
    }

    public void eliminar(Long id) {
        turnoIdao.eliminar(id);
    }

    public List<Turno> listarTodos() {
        return turnoIdao.listarTodos();
    }

    public Turno listar(Long id) {
        return turnoIdao.listar(id);
    }

    public Turno modificar(Long id , Turno turno) {
        return turnoIdao.modificar(id, turno);
    }
}
