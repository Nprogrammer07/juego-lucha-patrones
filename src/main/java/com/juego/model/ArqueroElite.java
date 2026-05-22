package com.juego.model;

public class ArqueroElite extends Arquero{
    private int eficiencia = 20; // Los arqueros más entrenados son más eficaces en batalla

    public ArqueroElite(String nombre){
        super(nombre, 150);
    }

    @Override
    public void dispararFlecha(Personaje oponente){
        // Su eficiencia les ayuda a hacer más daño
        int danoTotal = 20 + eficiencia;
        System.out.println("¡" + getNombre() + " ha disparado dos flechas gracias a su experiencia! Ha causado " + danoTotal + " puntos de daño.");
        oponente.recibirDano(danoTotal);
    }
}