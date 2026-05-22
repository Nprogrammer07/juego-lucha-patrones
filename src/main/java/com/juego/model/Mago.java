package com.juego.model;

public abstract class Mago extends Personaje {
    //Creación de familia base de magos: 

    public Mago(String nombre, int vida){
        super(nombre, vida);
    }

    public abstract void lanzarHechizo(Personaje oponente);
}