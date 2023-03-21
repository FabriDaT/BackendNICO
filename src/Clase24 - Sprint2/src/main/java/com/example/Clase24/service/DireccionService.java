package com.example.Clase24.service;

import com.example.Clase24.dao.Idao;
import com.example.Clase24.model.Direccion;

import java.util.List;

public class DireccionService {
    Idao<Direccion> direccionIdao;

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

    public Direccion modificar(long id){
        return direccionIdao.modificar(id);
    }
}
