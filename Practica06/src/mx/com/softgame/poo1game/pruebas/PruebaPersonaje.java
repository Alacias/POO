package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaPersonaje {
    public static void main(String[] args) {
        Personaje per01 = new Personaje("Aline", 200);
        Personaje per02 = new Personaje("Valeria", 10);
        Personaje per03 = new Personaje("Federico", 1);
        Personaje per04 = new Personaje("Mayela", -10);
        Personaje per05 = new Personaje("Edwin", 500);

        per01.getDetalle();
        per02.getDetalle();
        per03.getDetalle();
        per04.getDetalle();
        per05.getDetalle();

        Personaje per06 = per05;
        Personaje per07 = per04;
        Personaje per08 = per03;
        Personaje per09 = per02;
        Personaje per10 = per01;

        per06.setNombre("Patrick Alberto Camilo");
        per08.setNombre("Hanna");
        per10.setNombre("Jorge Abraham");
       
    }
}