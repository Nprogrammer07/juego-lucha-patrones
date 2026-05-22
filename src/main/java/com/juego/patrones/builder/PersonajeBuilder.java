package com.juego.patrones.builder;

import com.juego.model.Personaje;


public class PersonajeBuilder {
    private String nombre = "Desconocido";
    private int puntosDeVida = 150;

    public PersonajeBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this; // Se deja así para el encadenamiento de atributos o parámetros
    }

    public PersonajeBuilder conVida(int puntosDeVida){
        this.puntosDeVida = puntosDeVida;
        return this;
    }

    public Personaje build(){
        // En este método se pondrá la lógica de validación antes de crear un personaje
        return new Personaje (this.nombre, this.puntosDeVida);
    }
}