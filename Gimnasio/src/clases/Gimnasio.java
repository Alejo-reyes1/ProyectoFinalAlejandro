package clases;
import java.util.ArrayList;

public class Gimnasio {
	private String nombre;
	private ArrayList<Cliente>clientes;
	private ArrayList<Entrenador>entrenadores;
	public Gimnasio(String nombre) {
		super();
		this.nombre = nombre;
		this.clientes = new ArrayList<>();
		this.entrenadores = new ArrayList<>();
	}
	public void agregarEntrenador(Entrenador e) {
		this.entrenadores.add(e);
	}
	public void mostrarClientes() {
		for (Cliente c: this.clientes) {
			System.out.println(c.toString());
		}
	}
	public boolean buscarEntrenador(Entrenador e) {
		for(Entrenador e2:this.entrenadores){
			String nombre=e.getNombre();
			String telefono=e.getTelefono();
			if(e2.getNombre().equalsIgnoreCase(nombre) && e2.getTelefono().equalsIgnoreCase(telefono)) {
				return true 
				
			}
		}return false
	}
	


}
