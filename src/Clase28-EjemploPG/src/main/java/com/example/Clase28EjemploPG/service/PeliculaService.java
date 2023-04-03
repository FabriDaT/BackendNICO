package com.example.Clase28EjemploPG.service;

import com.example.Clase28EjemploPG.model.Pelicula;
import com.example.Clase28EjemploPG.repository.IRepository;
import com.example.Clase28EjemploPG.dto.PeliculaDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class PeliculaService {

    private IRepository<Pelicula> peliculaRepository;

    public PeliculaService(IRepository<Pelicula> peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    public Pelicula agregarPelicula(Pelicula pelicula){
        return this.peliculaRepository.agregar(pelicula);
    }
    public List<PeliculaDTO> buscarTodas(){
        //aca creo el mapper para luego mapear
        ObjectMapper mapper = new ObjectMapper();
        List<Pelicula> peliculas = peliculaRepository.buscar();
        List<PeliculaDTO> peliculasDTO = new ArrayList<PeliculaDTO>();

        for(Pelicula pelicula : peliculas) {
            //aca mapeo el objeto de la clase pelicula hacia la clase peliculaDTO
            PeliculaDTO peliculaDTO = mapper.convertValue(pelicula,PeliculaDTO.class);
            peliculasDTO.add(peliculaDTO);
        }

        return peliculasDTO;
    }

    public Boolean eliminar(Integer id){

        return peliculaRepository.eliminar(id);
    }

    public Pelicula actualizar(Pelicula pelicula){
        return peliculaRepository.actualizar(pelicula);}

    public Pelicula buscar(Integer id){
        return peliculaRepository.buscar(id);}

}
