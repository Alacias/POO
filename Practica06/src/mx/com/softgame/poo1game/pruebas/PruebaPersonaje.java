package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaPersonaje {
    public static void main(String[] args) {
        Personaje per01 = new Personaje("Aline", 200);
        Personaje per02 = new Personaje("Valeria", 10);
        Personaje per03 = new Personaje("Federico", 1);
        Personaje per04 = new Personaje("Mayela", -10);
        Personaje per05 = new Personaje("Edwin", 500);

        getDetalle();
       
    }
}