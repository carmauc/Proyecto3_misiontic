package com.example.proyecto_c32.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto_c32.modelo.pacientes;

@Repository
public interface exploracion_fisica_respository extends JpaRepository<pacientes, Integer> {
    
}