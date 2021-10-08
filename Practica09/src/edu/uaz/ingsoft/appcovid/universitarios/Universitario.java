package Practica09.src.edu.uaz.ingsoft.appcovid.universitarios;

public class Universitario {
    private String nombre;

    public Universitario(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Object o) {
        boolean resultado = false;
        if ((o != null) && (o instanceof Universitario)) {
            Universitario d = (Universitario) o;
            if ((nombre.equals(d.nombre)) {
                resultado = true;
            }
        }
        return resultado;
    }

    public int hashCode() {
        int hc = nombre.hashCode();
        return hc;
    }

    public String toString() {
        return nombre;
    }
    
}