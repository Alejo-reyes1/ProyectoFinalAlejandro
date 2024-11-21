package clases;

import java.sql.Date;
import java.time.LocalDate;

public class Persona{
	private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String nacionalidad;

    // Atributos específicos para cada tipo de persona
    private TipoParticipacion tipoParticipacion;
    private Integer aniosExperiencia; // Para Atleta y Personal de Apoyo
    private String areaEspecializacion; // Para Entrenador
    private String categoriaArbitraje; // Para Árbitro

    public Persona(String nombre, String apellidos, Date fechaNacimiento, String nacionalidad, TipoParticipacion tipoParticipacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.tipoParticipacion = tipoParticipacion;
    }

    // Métodos para configurar atributos específicos según el tipo de participación
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public void setCategoriaArbitraje(String categoriaArbitraje) {
        this.categoriaArbitraje = categoriaArbitraje;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public TipoParticipacion getTipoParticipacion() {
        return tipoParticipacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public String getCategoriaArbitraje() {
        return categoriaArbitraje;
    }
}

