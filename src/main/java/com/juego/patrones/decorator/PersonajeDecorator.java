package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public abstract class PersonajeDecorator extends Personaje{
    protected Personaje personajeDecorado; // -> Personaje que se está envolviendo

    public PersonajeDecorator(Personaje personajeDecorado){
        super(personajeDecorado.getNombre(), personajeDecorado.getPuntosDeVida());
        this.personajeDecorado = personajeDecorado;
    }

    @Override
    public String getNombre(){
        return personajeDecorado.getNombre();
    }

    @Override
    public int getPuntosDeVida(){
        return personajeDecorado.getPuntosDeVida();
    }

    @Override
    public boolean estaVivo(){
        return personajeDecorado.estaVivo();
    }
}