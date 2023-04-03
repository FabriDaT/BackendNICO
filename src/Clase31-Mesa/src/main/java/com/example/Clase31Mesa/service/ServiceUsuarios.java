package com.example.Clase31Mesa.service;

import com.example.Clase31Mesa.entity.Usuarios;
import com.example.Clase31Mesa.repository.IRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ServiceUsuarios implements IService{
    IRepository iRepository;

    public ServiceUsuarios(IRepository iRepository) {
        this.iRepository = iRepository;
    }

    @Override
    public List<Usuarios> findAll() {
        return iRepository.findAll();
    }

    @Override
    public Optional<Usuarios> findById(Long id) {
        return iRepository.findById(id);
    }

    @Override
    public Usuarios save(Usuarios usuarios) {
        if (usuarios != null){
            return iRepository.save(usuarios);
        }
        return usuarios;
    }

    @Override
    public String delete(Long id) {
        if (iRepository.existsById(id)){
            iRepository.deleteById(id);
            return "Eliminado con exito id" + id;
        }else{
            return "Id incorrecto" + id;
        }
    }

    @Override
    public String update(Usuarios usuarios) {
        return null;
    }
}
