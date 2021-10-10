public class Personaje {
    private String nombre;
    private String edad;

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