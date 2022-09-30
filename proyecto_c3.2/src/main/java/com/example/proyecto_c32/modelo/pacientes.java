package com.example.proyecto_c32.modelo;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table (name="pacientes")
public class pacientes {
//ATRIBUTOS
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
@Column(name="id_pacientes")
    private int id_pacientes;
@Column(name="nombres")
    private String nombres;
@Column(name="apellidos")
    private String apellidos;
@Column(name="edad")
    private int edad;
@Column(name="fecha_nacimiento")
    private Date fecha_nacimiento;
@Column(name="email")
    private String email;
@Column(name="direccion")
    private String direccion;
@Column(name="telefono")
    private String telefono;
@Column(name="sexo")
    private String sexo;

/* @ManyToOne (optional = false)
@JoinColumn(name= "id_pacientes")
private diagnostico_presuntivo diagnostico_presuntivo; */

/* @ManyToMany (cascade = CascadeType.ALL)
@JoinTable (name= "diagnostico_presuntivo",
joinColumns = { @JoinColumn(name = "id_pacientes")},
inverseJoinColumns = {@JoinColumn(name = "id_diagnostico")})
private Set <pacientes> pacientes = new HashSet<>(); */


@OneToMany (mappedBy = "pacientes")
private Set <diagnostico_presuntivo> diagnostico_presuntivo = new HashSet<>();

@OneToMany (mappedBy = "pacientes")
private Set <antecedentes_patologicos> antecedentes_patologicos = new HashSet<>();

@OneToMany (mappedBy = "pacientes")
private Set <antecedentes_no_patologicos> antecedentes_no_patologicos = new HashSet<>();

@OneToMany (mappedBy = "pacientes")
private Set <exploracion_fisica> exploracion_fisica = new HashSet<>();

@OneToMany (mappedBy = "pacientes")
private Set <motivo_consulta> motivo_consulta = new HashSet<>();

    public pacientes (){

    }

    public pacientes(int id_pacientes, String nombres, String apellidos, int edad, Date fecha_nacimiento, String email,
            String direccion, String telefono, String sexo,
            Set<com.example.proyecto_c32.modelo.diagnostico_presuntivo> diagnostico_presuntivo,
            Set<com.example.proyecto_c32.modelo.antecedentes_patologicos> antecedentes_patologicos,
            Set<com.example.proyecto_c32.modelo.antecedentes_no_patologicos> antecedentes_no_patologicos,
            Set<com.example.proyecto_c32.modelo.exploracion_fisica> exploracion_fisica,
            Set<com.example.proyecto_c32.modelo.motivo_consulta> motivo_consulta) {
        this.id_pacientes = id_pacientes;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.diagnostico_presuntivo = diagnostico_presuntivo;
        this.antecedentes_patologicos = antecedentes_patologicos;
        this.antecedentes_no_patologicos = antecedentes_no_patologicos;
        this.exploracion_fisica = exploracion_fisica;
        this.motivo_consulta = motivo_consulta;
    }

    public int getId_pacientes() {
        return id_pacientes;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public Set<diagnostico_presuntivo> getDiagnostico_presuntivo() {
        return diagnostico_presuntivo;
    }

    public Set<antecedentes_patologicos> getAntecedentes_patologicos() {
        return antecedentes_patologicos;
    }

    public Set<antecedentes_no_patologicos> getAntecedentes_no_patologicos() {
        return antecedentes_no_patologicos;
    }

    public Set<exploracion_fisica> getExploracion_fisica() {
        return exploracion_fisica;
    }

    public Set<motivo_consulta> getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setId_pacientes(int id_pacientes) {
        this.id_pacientes = id_pacientes;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDiagnostico_presuntivo(Set<diagnostico_presuntivo> diagnostico_presuntivo) {
        this.diagnostico_presuntivo = diagnostico_presuntivo;
    }

    public void setAntecedentes_patologicos(Set<antecedentes_patologicos> antecedentes_patologicos) {
        this.antecedentes_patologicos = antecedentes_patologicos;
    }

    public void setAntecedentes_no_patologicos(Set<antecedentes_no_patologicos> antecedentes_no_patologicos) {
        this.antecedentes_no_patologicos = antecedentes_no_patologicos;
    }

    public void setExploracion_fisica(Set<exploracion_fisica> exploracion_fisica) {
        this.exploracion_fisica = exploracion_fisica;
    }

    public void setMotivo_consulta(Set<motivo_consulta> motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

  

   

}
