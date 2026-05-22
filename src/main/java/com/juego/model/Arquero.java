package com.juego.model;

public abstract class Arquero extends Personaje{
    // Creación de familia base de arqueros.

    public Arquero(String nombre, int vida){
        super(nombre, vida);
    }

    public abstract void dispararFlecha(Personaje oponente);

}