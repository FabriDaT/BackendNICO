package com.example.Clase33EjemploPG.service;

import com.example.Clase33EjemploPG.modelo.Alumno;
import com.example.Clase33EjemploPG.repository.AlumnoIRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class AlumnoService implements IService<Alumno>{
    AlumnoIRepository iRepository;

    public AlumnoService(AlumnoIRepository alumnoIRepository) {
        this.iRepository = alumnoIRepository;
    }

    @Override
    public List<Alumno> findAll() {
        return iRepository.findAll();
    }

    @Override
    public Optional<Alumno> findById(Long id) {
        return iRepository.findById(id);
    }

    @Override
    public Alumno save(Alumno alumno) {
        if (alumno != null){
            return iRepository.save(alumno);
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
    public String update(Alumno alumno) {
        return null;
    }
}
