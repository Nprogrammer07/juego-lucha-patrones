package com.juego.model;

public class ArqueroInmortal extends Arquero {
    private int escudo = 50; // Los arqueros inmortales cuentan con un escudo que absorben daño

    public ArqueroInmortal(String nombre){
        super(nombre, 150); 
        this.puntosDeVida += escudo; // Vida extra por su escudo
    }

    @Override
    public void dispararFlecha(Personaje oponente){
        int dano = 20;
        System.out.println("¡" + getNombre() + " ha disparado una flecha, causando " + dano + " puntos de daño.");
        oponente.recibirDano(dano);
    }
    
}