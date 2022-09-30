package com.example.proyecto_c32.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto_c32.modelo.pacientes;
import com.example.proyecto_c32.repository.pacientesrepository;

@Service
public class pacientes_service {
    @Autowired
    private pacientesrepository repo1;

    public pacientes create(pacientes pacientes){
        return repo1.save (pacientes);

    }

    public List <pacientes> Listpacientes (){
        return (List<pacientes>) repo1.findAll();

    }
}
