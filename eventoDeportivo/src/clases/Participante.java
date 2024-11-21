package clases;

public class Participante {
	  private Persona persona;
	  private int edad;
	  private String paisRepresentacion;

	  public Participante(Persona persona, int edad, String paisRepresentacion) {
	        this.persona = persona;
	        this.edad = edad;
	        this.paisRepresentacion = paisRepresentacion;
	  }

	    // Getters y setters
	  public Persona getPersona() {
	        return persona;
	  }

	    public int getEdad() {
	        return edad;
	    }

	    public String getPaisRepresentacion() {
	        return paisRepresentacion;
	    }
	}

	

