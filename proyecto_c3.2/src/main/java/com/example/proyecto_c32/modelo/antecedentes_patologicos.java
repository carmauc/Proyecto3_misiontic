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
public class antecedentes_patologicos {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
@Column(name="id_antecedentespatologicos")
private int id_antecedentespatologicos;
@Column(name="pulmonares")
private Boolean pulmonares;
@Column(name="cardiacos")
private Boolean cardiacos;
@Column(name="digestivos")
private Boolean digestivos;
@Column(name="endocrinos")
private Boolean endocrinos;
@Column(name="genitourinarios")
private Boolean genitourinarios;
@Column(name="hematologicos")
private Boolean hematologicos;
@Column(name="neurologicos")
private Boolean neurologicos;
@Column(name="psiquiatricos")
private Boolean psiquiatricos;
@Column(name="traumatologicos")
private Boolean traumatologicos;
@ManyToOne
@JoinColumn (name = "id_pacientes")
@JsonBackReference
private pacientes pacientes;
public int getId_antecedentespatologicos() {
    return id_antecedentespatologicos;
}
public Boolean getPulmonares() {
    return pulmonares;
}
public Boolean getCardiacos() {
    return cardiacos;
}
public Boolean getDigestivos() {
    return digestivos;
}
public Boolean getEndocrinos() {
    return endocrinos;
}
public Boolean getGenitourinarios() {
    return genitourinarios;
}
public Boolean getHematologicos() {
    return hematologicos;
}
public Boolean getNeurologicos() {
    return neurologicos;
}
public Boolean getPsiquiatricos() {
    return psiquiatricos;
}
public Boolean getTraumatologicos() {
    return traumatologicos;
}
public pacientes getPacientes() {
    return pacientes;
}
public void setId_antecedentespatologicos(int id_antecedentespatologicos) {
    this.id_antecedentespatologicos = id_antecedentespatologicos;
}
public void setPulmonares(Boolean pulmonares) {
    this.pulmonares = pulmonares;
}
public void setCardiacos(Boolean cardiacos) {
    this.cardiacos = cardiacos;
}
public void setDigestivos(Boolean digestivos) {
    this.digestivos = digestivos;
}
public void setEndocrinos(Boolean endocrinos) {
    this.endocrinos = endocrinos;
}
public void setGenitourinarios(Boolean genitourinarios) {
    this.genitourinarios = genitourinarios;
}
public void setHematologicos(Boolean hematologicos) {
    this.hematologicos = hematologicos;
}
public void setNeurologicos(Boolean neurologicos) {
    this.neurologicos = neurologicos;
}
public void setPsiquiatricos(Boolean psiquiatricos) {
    this.psiquiatricos = psiquiatricos;
}
public void setTraumatologicos(Boolean traumatologicos) {
    this.traumatologicos = traumatologicos;
}
public void setPacientes(pacientes pacientes) {
    this.pacientes = pacientes;
}




}
