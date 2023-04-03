package com.example.Clase28.service;

import com.example.Clase28.repository.Idao;
import com.example.Clase28.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService {
    Idao<Odontologo> odontologoIDao;


    public void setOdontologoIDao(Idao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo agregar(Odontologo odontologo) {
        return odontologoIDao.agregar(odontologo);
    }
    public void eliminar(long id){
        odontologoIDao.eliminar(id);
    }
    public Odontologo listar(long id){
        return odontologoIDao.listar(id);
    }

    public List<Odontologo> listarTodos() {
        return odontologoIDao.listarTodos();
    }

    public Odontologo modificar(long id, Odontologo odontologo){
        return odontologoIDao.modificar(id, odontologo);
    }
}
