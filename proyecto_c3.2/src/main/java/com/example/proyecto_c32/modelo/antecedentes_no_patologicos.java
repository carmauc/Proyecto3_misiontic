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
@Table (name="antecedentes_patologicos")
public class antecedentes_no_patologicos {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
@Column(name="id_antecedentesnopatologicos")
private int id_antecedentesnopatologicos;
@Column(name="alcoholismo")
private Boolean alcoholismo;
@Column(name="tabaquismo")
private Boolean tabaquismo;
@Column(name="drogadiccion")
private Boolean drogadiccion;
@Column(name="alergias")
private Boolean alergias;
@Column(name="cirugias")
private Boolean cirugias;
@ManyToOne
@JoinColumn (name = "id_pacientes")
@JsonBackReference
private pacientes pacientes;
public int getId_antecedentesnopatologicos() {
    return id_antecedentesnopatologicos;
}
public Boolean getAlcoholismo() {
    return alcoholismo;
}
public Boolean getTabaquismo() {
    return tabaquismo;
}
public Boolean getDrogadiccion() {
    return drogadiccion;
}
public Boolean getAlergias() {
    return alergias;
}
public Boolean getCirugias() {
    return cirugias;
}
public pacientes getPacientes() {
    return pacientes;
}
public void setId_antecedentesnopatologicos(int id_antecedentesnopatologicos) {
    this.id_antecedentesnopatologicos = id_antecedentesnopatologicos;
}
public void setAlcoholismo(Boolean alcoholismo) {
    this.alcoholismo = alcoholismo;
}
public void setTabaquismo(Boolean tabaquismo) {
    this.tabaquismo = tabaquismo;
}
public void setDrogadiccion(Boolean drogadiccion) {
    this.drogadiccion = drogadiccion;
}
public void setAlergias(Boolean alergias) {
    this.alergias = alergias;
}
public void setCirugias(Boolean cirugias) {
    this.cirugias = cirugias;
}
public void setPacientes(pacientes pacientes) {
    this.pacientes = pacientes;
}






}
