package Practica09.src.edu.uaz.ingsoft.appcovid.universitarios;

public class Universitario {
    private String nombre;

    Universitario(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Object o) {

    }

    public int hashCode() {
        int hc = nombre.hashCode();
        return hc;
    }

    public String toString() {
        return nombre;
    }
    
}