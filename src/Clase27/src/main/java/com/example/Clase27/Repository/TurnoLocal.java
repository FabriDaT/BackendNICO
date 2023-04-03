package com.example.Clase27.Repository;

import com.example.Clase27.model.Turno;

import java.util.ArrayList;
import java.util.List;

public class TurnoLocal implements Idao<Turno>{
    List listaTurno = new ArrayList<>();


    @Override
    public Turno agregar(Turno turno) {
        turno.agregarListado(turno);
        return turno;
    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public List<Turno> listarTodos() {
        return null;
    }

    @Override
    public Turno listar(Long id) {

        return null;
    }

    @Override
    public Turno modificar(Long id , Turno turno) {
        return null;
    }
}
