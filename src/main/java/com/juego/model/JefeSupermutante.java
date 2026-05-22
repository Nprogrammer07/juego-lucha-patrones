package com.juego.model;

public class JefeSupermutante extends Personaje {
    public JefeSupermutante(String nombre){
        super(nombre, 400); // El supermutante es el jefe más difícil y por tanto, con más vida
    }

    @Override 
    public void atacar(Personaje oponente){
        int dano = this.rand.nextInt(31) + 30; // Podrá hacer un daño de 30 hasta 60 puntos de daño.
        oponente.recibirDano(dano);
        System.out.println("¡El " + getNombre() + " aplasta con su garrote a " + oponente.getNombre() + " causándole " + dano + " puntos de daño!");
    }
}