package mx.com.softgame.poo1game.personajes;

public class Personaje {
    private String nombre;
    private int edad;

    public Personaje(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDetalle() {
        return nombre + "\t" + edad;
    }

    public int getEdad() {
        return edad;
    }

    public boolean setEdad(int edad) {
        if (edad > 0 && edad < 120) {
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 3 && nombre.length() < 20) {
            this.nombre = nombre;
        }
    }

    public void saludar() {
        System.out.println("Hola Alumno de POO " + nombre);
    }

}