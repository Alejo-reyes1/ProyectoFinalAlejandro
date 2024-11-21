package clases;

public class Cliente {
	private String nombre;
	private int edad;
	private String genero;
	private Membresia membresia;
	private String fechaInscripcion;
	private Entrenador entrenador;

	public Cliente(String nombre, int edad, String genero,Membresia membresia, String fechaInscripcion, Entrenador entrenador) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.membresia=membresia;
		this.fechaInscripcion=fechaInscripcion;
		this.entrenador=entrenador;
				
	}
	
	public Membresia getMembresia() {
		return membresia;
	}


	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}


	public String getFechaInscripcion() {
		return fechaInscripcion;
	}


	public void setFechaInscripcion(String fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}


	public Entrenador getEntrenador() {
		return entrenador;
	}


	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}
	
}

