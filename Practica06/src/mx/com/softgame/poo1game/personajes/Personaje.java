package mx.com.softgame.poo1game.personajes;

public class Personaje {
    private static String nombre;
    private static int edad;

    public Personaje(String nombre, int edad) {
        this.nombre = nombre;
        edad = 0;
    }

    public static String getDetalle() {
        return nombre + "\t" + Integer.toString(edad);
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