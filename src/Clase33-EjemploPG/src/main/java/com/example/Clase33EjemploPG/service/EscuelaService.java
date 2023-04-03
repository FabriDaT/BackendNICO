package com.example.Clase33EjemploPG.service;

import com.example.Clase33EjemploPG.modelo.Escuela;
import com.example.Clase33EjemploPG.repository.EscuelaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EscuelaService implements IService<Escuela> {
    EscuelaRepository iRepository;

    public EscuelaService(EscuelaRepository iRepository) {
        this.iRepository = iRepository;
    }

    @Override
    public List<Escuela> findAll() {
        return iRepository.findAll();
    }

    @Override
    public Optional<Escuela> findById(Long id) {
        return iRepository.findById(id);
    }

    @Override
    public Escuela save(Escuela escuela) {
        if (escuela != null){
            return iRepository.save(escuela);
        }
        return null;
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
    public String update(Escuela escuela) {
        return null;
    }
}
