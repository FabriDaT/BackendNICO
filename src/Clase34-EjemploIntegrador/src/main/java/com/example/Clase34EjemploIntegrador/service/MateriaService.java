package com.example.Clase34EjemploIntegrador.service;

import com.example.Clase34EjemploIntegrador.model.DTO.MateriaDTO;
import com.example.Clase34EjemploIntegrador.model.Materia;
import com.example.Clase34EjemploIntegrador.repository.IMateriaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MateriaService implements IService<MateriaDTO> {
    @Autowired
    IMateriaRepository iMateriaRepository;
    @Autowired
    ObjectMapper mapper;


    @Override
    public Set<MateriaDTO> findAll() {
        List<Materia> materias = iMateriaRepository.findAll();
        Set<MateriaDTO> materiaDTOS = new HashSet<>();
        for (Materia m : materias) {
            materiaDTOS.add(mapper.convertValue(m, MateriaDTO.class));
        }
        return materiaDTOS;
    }

    @Override
    public Optional<MateriaDTO> findById(Long id) {
       Optional<Materia> materia = iMateriaRepository.findById(id);
       MateriaDTO materiaDTO = null;
       if (materia.isPresent()){
            materiaDTO = mapper.convertValue(materia, MateriaDTO.class);
        }
        return Optional.ofNullable(materiaDTO);
    }

    @Override
    public void save(MateriaDTO materiaDTO) {
        Materia materia = mapper.convertValue(materiaDTO, Materia.class);
        iMateriaRepository.save(materia);
    }

    @Override
    public void delete(Long id) {
        iMateriaRepository.deleteById(id);
    }

    @Override
    public String update(MateriaDTO materiaDTO) {
        Materia materia = mapper.convertValue(materiaDTO, Materia.class);
        return "Materia modificada " + iMateriaRepository.save(materia);
    }
}
