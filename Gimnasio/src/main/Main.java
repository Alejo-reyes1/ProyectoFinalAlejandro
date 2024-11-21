package main;

import javax.swing.JOptionPane;

import clases.Cliente;
import clases.Entrenador;
import clases.Gimnasio;
import clases.Membresia;

public class Main {
	
	public static Gimnasio g= new Gimnasio("fitplus");

	public static void main(String[] args) {
		int opcionMenu;
		String menuPrincipal = "Menu principal\n"+
		"Ingrese la opci�n correspondiente:\n"+
		"1. Agregar cliente.\n" +
		"2. Agregar entrenador.\n" +
		"3. Mostrar Clientes.\n";
		
		int opcionSeleccionada = 0;	
		
		
		do {
			opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(null,menuPrincipal));
			opcionMenu(opcionSeleccionada);
		} while (opcionSeleccionada != 9);
	}
	private static void opcionMenu(int opt) {
		switch (opt) {
		case 1: 
			agregarCliente();
			break;	
		case 2:
			agregarEntrenador();
			break;
		case 3:
			imprimirClientes();
			break;
		default:
			break;
		}
	}	
	private static void agregarCliente() {
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del usuario");
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario"));
		String membresia=JOptionPane.showInputDialog("Ingrese la membresia del usuario");
		String genero=JOptionPane.showInputDialog("Ingrese el genero del usuario");
		String  entrenador=JOptionPane.showInputDialog("Ingrese el entreador asignado");
		String fechaInscripcion=JOptionPane.showInputDialog("Ingrese la fecha de inscrpicion");
		boolean existeEntrenador=g.buscarEntrenador(entrenador)
		if(membresia.equalsIgnoreCase("mensual")) {
			Cliente c=new Cliente(nombre,edad,genero,Membresia.MENSUAL,fechaInscripcion,entrenador);
		}
		
	}
	private static void agregarEntrenador() {
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del entrenador");
		String especialidad=JOptionPane.showInputDialog("Ingrese la especialidad del entrenador");
		String telefono=JOptionPane.showInputDialog("Ingrese el telefono del entrenador");
		String gmail=JOptionPane.showInputDialog("Ingrese el gmail del entrenador");
		
		Entrenador e= new Entrenador(nombre,especialidad,telefono,gmail);
		g.agregarEntrenador(e);
		
	}

	public static void imprimirClientes() {
		System.out.println("La lista de clientes registrados es:");
		g.mostrarClientes();
	}

}
