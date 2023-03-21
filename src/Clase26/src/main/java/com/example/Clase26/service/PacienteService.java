package com.example.Clase26.service;


import com.example.Clase26.dao.Idao;
import com.example.Clase26.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteService {
    private Idao<Paciente> pacienteIdao;

//    public PacienteService(Idao<Paciente> pacienteIdao) {
//        this.pacienteIdao = pacienteIdao;
//    }


    public void setPacienteIdao(Idao<Paciente> pacienteIdao) {
        this.pacienteIdao = pacienteIdao;
    }

    public Paciente agregar(Paciente paciente){
        return pacienteIdao.agregar(paciente);
    }
    public void eliminar(Long id){
        pacienteIdao.eliminar(id);
    }

    public List<Paciente> listarTodos(){
        return pacienteIdao.listarTodos();
    }
    public Paciente listar(Long id){
        return pacienteIdao.listar(id);
    }
    public Paciente modificar(Long id, Paciente paciente){
        return pacienteIdao.modificar(id, paciente);
    }


}
