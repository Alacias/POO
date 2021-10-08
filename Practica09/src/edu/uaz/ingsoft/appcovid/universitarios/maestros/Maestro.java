package Practica09.src.edu.uaz.ingsoft.appcovid.universitarios.maestros;
import Practica09.src.edu.uaz.ingsoft.appcovid.universitarios.Universitario;

public class Maestro extends Universitario {
    private float sueldo;

    public void Sueldo() {
        while (sueldo >= 100 && sueldo <= 20000) {
            sueldo = true;
            
    
        }
    }

    public Maestro(String nombre, float sueldo) {

    }

    public Maestro(String nombre) {

    }

    public boolean equals(Object o) {
        boolean resultado = false;
        if ((o != null) && (o instanceof Maestro)) {
            Maestro d = (Maestro) o;
            if ((sueldo.equals(d.sueldo)) {
                resultado = true;
            }
        }
        return resultado;
    }

    public int hashCode() {
        int hc = sueldo.hashCode();
        return hc;
    }

    public String toString() {
        return sueldo;
    }
    
}

