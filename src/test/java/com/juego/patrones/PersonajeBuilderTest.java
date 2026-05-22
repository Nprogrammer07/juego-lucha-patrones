package com.juego.patrones;

import com.juego.model.Personaje;
import com.juego.patrones.builder.PersonajeBuilder;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonajeBuilderTest{

    @Test 
    @DisplayName("Debe construir un personaje con los valores proporcionados por el builder")
    void testConstruccionExitosa(){

        Personaje heroe = new PersonajeBuilder()
            .conNombre("Alejandro Magno")
            .conVida(500)
            .build();

        assertNotNull(heroe, "El personaje no debería ser nulo");
        assertEquals("Alejandro Magno", heroe.getNombre());
        assertEquals(500, heroe.getPuntosDeVida());

    }

    @Test 
    @DisplayName("Builder debe permitir construcción parcial o con valores por defecto")
    void testConstruccionParcial(){
        // Validación de que el builder tenga valores por defecto si no se llama ningún método
        Personaje npc = new PersonajeBuilder()
            .conNombre("Aldeano")
            .build();
        assertEquals("Aldeano", npc.getNombre());
        assertEquals(150, npc.getPuntosDeVida());
    }
}