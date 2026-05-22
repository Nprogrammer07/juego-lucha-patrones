package com.juego.model;

public class MagoOscuro extends Mago{
    private int corrupcion = 15; // Atributo único debido a su oscuridad

    public MagoOscuro(String nombre){
        super(nombre, 110); // Menos vida base
    }

    @Override
    public void lanzarHechizo(Personaje oponente){
        // La corrupción aumenta el daño causado
        int danoTotal = 25 + corrupcion;
        System.out.println("¡" + getNombre() + " usa Magia Corrupta para potenciar su ataque, provocando " + danoTotal + " puntos de daño!");
        oponente.recibirDano(danoTotal);
    } 
}