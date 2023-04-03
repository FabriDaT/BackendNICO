package com.example.Clase28EjemploPG.repository.impl;

import com.example.Clase28EjemploPG.model.Pelicula;
import com.example.Clase28EjemploPG.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PeliculaListRepository  implements IRepository<Pelicula> {

    private List<Pelicula> peliculas;

    public PeliculaListRepository() {
        //apenas inicia el constructor carga las peliculas
        this.peliculas = cargarPeliculas();
    }

    @Override
    public Pelicula agregar(Pelicula pelicula) {
        if(pelicula.getId() == null)
            pelicula.setId(new Random().nextInt());
        this.peliculas.add(pelicula);
        return pelicula;

    }

    @Override
    public List<Pelicula> buscar() {
        //retorna todas las peliculas
        return this.peliculas;
    }

    @Override
    public Pelicula actualizar(Pelicula pelicula) {
        //primero la elimina
        eliminar(pelicula.getId());
        //luego la vuelva a agregar, actualizada
        agregar(pelicula);
        return pelicula;
    }

    @Override
    public Boolean eliminar(Integer id) {

        for(Pelicula p : peliculas){
            if(p.getId().equals(id)){
                peliculas.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public Pelicula buscar(Integer id) {
        for(Pelicula p : peliculas){
            if(p.getId().equals(id)){
               return p;
            }
        }
        return null;
    }


    private List<Pelicula> cargarPeliculas(){
        List<Pelicula> peliculasCargadas = new ArrayList<>();
        peliculasCargadas.add(new Pelicula(1,"Star Wars" , "Ficcion",7));
        peliculasCargadas.add(new Pelicula(2,"It" , "Terror",0));
        return peliculasCargadas;
    }
}
