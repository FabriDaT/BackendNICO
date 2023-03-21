package com.example.Clase25Mesa.service;

import com.example.Clase25Mesa.dao.Idao;
import com.example.Clase25Mesa.model.Direccion;
import jdk.jfr.SettingDefinition;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
