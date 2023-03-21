package com.example.Clase26.service;

import com.example.Clase26.dao.Idao;
import com.example.Clase26.model.Direccion;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DireccionService {
    Idao<Direccion> direccionIdao;

//    public DireccionService(Idao<Direccion> direccionIdao) {
//        this.direccionIdao = direccionIdao;
//    }

    public void setDireccionIdao(Idao<Direccion> direccionIdao) {
        this.direccionIdao = direccionIdao;
    }

    public Direccion agregar(Direccion direccion) {
        return direccionIdao.agregar(direccion);
    }
    public void eliminar(long id){
        direccionIdao.eliminar(id);
    }
    public Direccion  listar(long id){
        return direccionIdao.listar(id);
    }

    public List<Direccion> listarTodos() {
        return direccionIdao.listarTodos();
    }

    public Direccion modificar(long id, Direccion direccion){
        return direccionIdao.modificar(id, direccion);
    }
}
