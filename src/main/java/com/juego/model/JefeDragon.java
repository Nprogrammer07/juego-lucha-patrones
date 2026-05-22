package com.juego.model;

public class JefeDragon extends Personaje {
    public JefeDragon(String nombre){
        super(nombre, 300); // El dragon al ser un jefe, tiene mucha más vida.
    }

    @Override
    public void atacar(Personaje oponente){
        int dano = this.rand.nextInt(21) + 20; //El dragón puede hacer daño por ráfagas de fuego.
        System.out.println("¡El " + getNombre() + " exhala una ráfaga de fuego sobre " + oponente.getNombre() + " causándole " + dano + " puntos de daño ardiente!");
    }

}