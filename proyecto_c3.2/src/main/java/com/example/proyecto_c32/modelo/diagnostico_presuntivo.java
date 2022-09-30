package com.example.proyecto_c32.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table (name="diagnostico_presuntivo")
public class diagnostico_presuntivo{
    // Atributos
@Id
@GeneratedValue (strategy = GenerationType.AUTO)

    @Column(name="id_diagnostico")
    private int id_diagnostico;
    @Column(name="descripcion")
    private String descripcion;
@ManyToOne
@JoinColumn (name = "id_pacientes")
@JsonBackReference
    private pacientes pacientes;
public int getId_diagnostico() {
    return id_diagnostico;
}
public String getDescripcion() {
    return descripcion;
}
public pacientes getPacientes() {
    return pacientes;
}
public void setId_diagnostico(int id_diagnostico) {
    this.id_diagnostico = id_diagnostico;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public void setPacientes(pacientes pacientes) {
    this.pacientes = pacientes;
}

    

    
}
