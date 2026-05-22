package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class EspadaFuegoDecorator extends PersonajeDecorator{
    // Primer item que el jugador podrá obtener:

    public EspadaFuegoDecorator(Personaje personajeDecorado){
        super(personajeDecorado);
    }

    @Override
    public void atacar(Personaje oponente){
        // para su accionar, se tendrá el ataque normal y luego el plus del item:
        System.out.println(getNombre() + " hace un ataque base...");
        personajeDecorado.atacar(oponente);

        int danoFuego = 20;
        System.out.println("¡SE ACIVA LA ESPADA DE FUEGO! \n" + getNombre() + " inflige " + danoFuego + " puntos de daño por quemadura.");
        oponente.recibirDano(danoFuego);


    }
}