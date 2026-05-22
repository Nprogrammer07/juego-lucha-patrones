package com.juego.model;

import java.util.Random;

public class Personaje {
    private String nombre;
    protected int puntosDeVida;
    protected Random rand;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    public Personaje(String nombre){
        this.nombre = nombre;
        this.puntosDeVida = 150;
        this.rand = new Random();
    }


    // Constructor hecho para crear a los jefes con sus propios atributos.

    public Personaje(String nombre, int puntosDeVida){
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.rand = new Random();
    }

    public void atacar(Personaje oponente){
        int dano = rand.nextInt(MAX_DANO - MIN_DANO + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    public void recibirDano(int dano){
        if (dano < 0) return;
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0){
            this.puntosDeVida = 0;
        }
    }

    public boolean estaVivo(){
        return this.puntosDeVida > 0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPuntosDeVida(){
        return this.puntosDeVida;
    }


}