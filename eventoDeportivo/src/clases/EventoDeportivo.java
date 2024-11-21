package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

//Clase EventoDeportivo
class EventoDeportivo {
 private String nombre;
 private TipoEvento tipo;
 private Date fechaInicio;
 private String pais;
 private String ciudad;
 private String deporte;
 private ArrayList<Participante> participantes;
 private ArrayList<Equipo> equipos;

 public EventoDeportivo(String nombre, TipoEvento tipo, Date fechaInicio, String pais, String ciudad, String deporte) {
     this.nombre = nombre;
     this.tipo = tipo;
     this.fechaInicio = fechaInicio;
     this.pais = pais;
     this.ciudad = ciudad;
     this.deporte = deporte;
     this.participantes = new ArrayList<>();
     this.equipos = new ArrayList<>();
 }
 
 public void agregarParticipante(Participante participante) {
     participantes.add(participante);
 }

 public void agregarEquipo(Equipo equipo) {
     equipos.add(equipo);
 }

 public ArrayList<Participante> getParticipantes() {
     return participantes;
 }

 public ArrayList<Equipo> getEquipos() {
     return equipos;
 }

 // Getters adicionales para los atributos
 public String getNombre() {
     return nombre;
 }

 public TipoEvento getTipo() {
     return tipo;
 }

 public Date getFechaInicio() {
     return fechaInicio;
 }
 public String getPais() {
     return pais;
 }

 public String getCiudad() {
     return ciudad;
 }
 public String getDeporte() {
	 return deporte;
 }


}
