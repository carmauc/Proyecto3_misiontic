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
@Table (name="exploracion_fisica")
public class exploracion_fisica {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
    
@Column(name="id_exploracion")
private int id_exploracion;
@Column(name="peso")
private Double peso;
@Column(name="estatura")
private Double estatura;
@Column(name="frecuencia_cardiaca")
private int frecuencia_cardiaca;
@Column(name="frecuencia_respiratoria")
private int frecuencia_respiratoria;
@Column(name="presion_arterial")
private String presion_arterial;
@Column(name="descripcion")
private String descripcion;
@Column(name="embarazo")
private boolean embarazo;
@ManyToOne
@JoinColumn (name = "id_pacientes")
@JsonBackReference
    private pacientes pacientes;
public int getId_exploracion() {
    return id_exploracion;
}
public Double getPeso() {
    return peso;
}
public Double getEstatura() {
    return estatura;
}
public int getFrecuencia_cardiaca() {
    return frecuencia_cardiaca;
}
public int getFrecuencia_respiratoria() {
    return frecuencia_respiratoria;
}
public String getPresion_arterial() {
    return presion_arterial;
}
public String getDescripcion() {
    return descripcion;
}
public boolean isEmbarazo() {
    return embarazo;
}
public pacientes getPacientes() {
    return pacientes;
}
public void setId_exploracion(int id_exploracion) {
    this.id_exploracion = id_exploracion;
}
public void setPeso(Double peso) {
    this.peso = peso;
}
public void setEstatura(Double estatura) {
    this.estatura = estatura;
}
public void setFrecuencia_cardiaca(int frecuencia_cardiaca) {
    this.frecuencia_cardiaca = frecuencia_cardiaca;
}
public void setFrecuencia_respiratoria(int frecuencia_respiratoria) {
    this.frecuencia_respiratoria = frecuencia_respiratoria;
}
public void setPresion_arterial(String presion_arterial) {
    this.presion_arterial = presion_arterial;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public void setEmbarazo(boolean embarazo) {
    this.embarazo = embarazo;
}
public void setPacientes(pacientes pacientes) {
    this.pacientes = pacientes;
}

    
}
