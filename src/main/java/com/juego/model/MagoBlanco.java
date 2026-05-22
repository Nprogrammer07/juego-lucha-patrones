package com.juego.model;

public class MagoBlanco extends Mago{
    private int puntosFe = 20; // Atributo único de los magos blancos -> Fe

    public MagoBlanco(String nombre){
        super(nombre, 130);
    }

    @Override
    public void lanzarHechizo(Personaje oponente){
        System.out.println(getNombre() + " lanza Destello Celestial.");
        oponente.recibirDano(25);
    }

    @Override
    public void recibirDano(int dano){
        // La fe ayuda a recibir menos daño
        int danoRecibido = Math.max(0, dano - (puntosFe / 5 ));
        super.recibirDano(danoRecibido);
        System.out.println("¡La Fe de " + getNombre() + " mitigó parte del daño! \n Daño recibido: " + danoRecibido);
    }
}