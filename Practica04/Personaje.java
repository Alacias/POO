package Practica04;

public class Personaje {
    private String nombre;
    private int edad = 0;

    public Personaje() {
        
    }

    public int getEdad() {
        return edad;
    }

    public boolean setEdad(int edad) {
        if (edad > 0 && edad < 120) {
            return edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola Alumno de POO " + nombre);
    }

}