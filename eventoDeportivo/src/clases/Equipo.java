package clases;

import java.util.ArrayList;
class Equipo {
    private String nombre;
    private String paisOrigen;
    private ArrayList<Persona> atletas;

    public Equipo(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.atletas = new ArrayList<>();
    }

    public void agregarAtleta(Persona atleta) {
        if (atleta.getTipoParticipacion() == TipoParticipacion.ATLETA) {
            atletas.add(atleta);
        } else {
            System.out.println("La persona no es un atleta y no puede ser añadida al equipo.");
        }
    }

    public ArrayList<Persona> getAtletas() {
        return atletas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
}
