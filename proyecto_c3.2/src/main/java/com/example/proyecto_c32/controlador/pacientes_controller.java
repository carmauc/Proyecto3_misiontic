package com.example.proyecto_c32.controlador;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto_c32.modelo.pacientes;
import com.example.proyecto_c32.repository.pacientesrepository;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController // decorador para procesar todas las peticiones http

public class pacientes_controller {
    // ATRIBUTOS
@Autowired
private pacientesrepository pacientesrepository;
/* private pacientes_service service; */


 @GetMapping
  List<pacientes> obtenerpacientes() {
    return pacientesrepository.findAll();
    }  

@GetMapping ("/{id}")
  Optional<pacientes> obtenerpacienteporid(@PathVariable int id) {
    return pacientesrepository.findById (id);
    }  

@PostMapping
pacientes crearPacientes(@RequestBody pacientes pacientes){
  {
    return pacientesrepository.save(pacientes);
  }
}

/*  @DeleteMapping ("/{id}")
pacientes borrarpaciente(@PathVariable int id){
  {
    return (id);
  }} */

}
/*    @GetMapping
  public ResponseEntity <List <pacientes>> listpacientes (){
    List<pacientes> obtenerPacientes =service.Listpacientes(); 
    return ResponseEntity.status(HttpStatus.OK).body(obtenerPacientes);
  }  */

