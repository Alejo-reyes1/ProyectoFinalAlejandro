package clases;

public class Entrenador {
	private String nombre;
	private String especialidad;
	private String telefono;
	private String correo;
	
	public Entrenador(String nombre, String especialidad, String telefono, String correo) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.telefono = telefono;
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
