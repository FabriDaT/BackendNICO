package com.example.Clase34EjemploIntegrador.service;

import com.example.Clase34EjemploIntegrador.model.Cursada;
import com.example.Clase34EjemploIntegrador.model.DTO.CursadaDTO;
import com.example.Clase34EjemploIntegrador.repository.ICursadaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CursadaService implements IService<CursadaDTO>{
    @Autowired
    ICursadaRepository iCursadaRepository;
    @Autowired
    ObjectMapper mapper;
    @Override
    public Set<CursadaDTO> findAll() {
        List<Cursada> cursadas = iCursadaRepository.findAll();
        Set<CursadaDTO> cursadaDTOS = new HashSet<>();
        for (Cursada c : cursadas) {
            cursadaDTOS.add(mapper.convertValue(c, CursadaDTO.class));
        }
        return cursadaDTOS;
    }

    @Override
    public Optional<CursadaDTO> findById(Long id) {
        Optional<Cursada> cursada = iCursadaRepository.findById(id);
        CursadaDTO cursadaDTO = null;
        if (cursada.isPresent()){
            cursadaDTO = mapper.convertValue(cursada, CursadaDTO.class);
        }
        return Optional.ofNullable(cursadaDTO);
    }

    @Override
    public void save(CursadaDTO cursadaDTO) {
        Cursada cursada = mapper.convertValue(cursadaDTO, Cursada.class);
        iCursadaRepository.save(cursada);
    }

    @Override
    public void delete(Long id) {
        iCursadaRepository.deleteById(id);
    }

    @Override
    public String update(CursadaDTO cursadaDTO) {
        Cursada cursada = mapper.convertValue(cursadaDTO, Cursada.class);
        return "Cursada modificada " + iCursadaRepository.saveAndFlush(cursada);
    }
}
