package com.example.Clase34EjemploIntegrador.service;

import com.example.Clase34EjemploIntegrador.model.DTO.EstudianteDTO;
import com.example.Clase34EjemploIntegrador.model.Estudiante;
import com.example.Clase34EjemploIntegrador.repository.IEstudianteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EstudianteService implements IService<EstudianteDTO> {
    @Autowired
    IEstudianteRepository iEstudianteRepository;
    @Autowired
    ObjectMapper mapper;
    @Override
    public Set<EstudianteDTO> findAll() {
        List<Estudiante> estudiantes = iEstudianteRepository.findAll();
        Set<EstudianteDTO> estudianteDTOS = new HashSet<>();
        for (Estudiante e : estudiantes) {
            estudianteDTOS.add(mapper.convertValue(e, EstudianteDTO.class));
        }
        return estudianteDTOS;
    }

    @Override
    public Optional<EstudianteDTO> findById(Long id) {
        Optional<Estudiante> estudiante = iEstudianteRepository.findById(id);
        EstudianteDTO estudianteDTO = null;
        if (estudiante.isPresent()){
            estudianteDTO = mapper.convertValue(estudiante, EstudianteDTO.class);
        }
        return Optional.ofNullable(estudianteDTO);
    }

    @Override
    public void save(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = mapper.convertValue(estudianteDTO, Estudiante.class);
        iEstudianteRepository.save(estudiante);
    }

    @Override
    public void delete(Long id) {
        iEstudianteRepository.deleteById(id);
    }

    @Override
    public String update(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = mapper.convertValue(estudianteDTO, Estudiante.class);
        return "Estudiante modificado " + iEstudianteRepository.save(estudiante);
    }
}
