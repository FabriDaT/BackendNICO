package com.example.Clase31Mesa.repository;

import com.example.Clase31Mesa.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository extends JpaRepository<Usuarios, Long> {

}
