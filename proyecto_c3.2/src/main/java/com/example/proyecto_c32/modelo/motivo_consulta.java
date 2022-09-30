package com.example.proyecto_c32.modelo;
import java.text.SimpleDateFormat;
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
@Table (name="motivo_consulta")
public class motivo_consulta {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)

@Column(name="id_motivoconsulta")
private int id_motivoconsulta;
@Column(name="motivo")
private String motivo;
@Column(name="hora_llegada")
private String hora_llegada;
@ManyToOne
@JoinColumn (name = "id_pacientes")
@JsonBackReference
    private pacientes pacientes;
public int getId_motivoconsulta() {
    return id_motivoconsulta;
}
public String getMotivo() {
    return motivo;
}
public String getHora_llegada() {
    return hora_llegada;
}
public pacientes getPacientes() {
    return pacientes;
}
public void setId_motivoconsulta(int id_motivoconsulta) {
    this.id_motivoconsulta = id_motivoconsulta;
}
public void setMotivo(String motivo) {
    this.motivo = motivo;
}
public void setHora_llegada(String hora_llegada) {
    this.hora_llegada = hora_llegada;
}
public void setPacientes(pacientes pacientes) {
    this.pacientes = pacientes;
}




}
