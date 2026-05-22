package com.juego.patrones.decorator;

import com.juego.model.Personaje;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonajeDecoratorTest {

    @Test 
    @DisplayName("El decorador de Espada de Fuego debería infligir daño extra al oponente")
    void testEspadaFuegoDecoradora(){

        Personaje guerrero = new Personaje("Alberto", 100);
        Personaje enemigo = new Personaje("Devin West", 100);

        // Se le da la espada de fuego al guerrero (envolver)
        Personaje guerreroArmado = new EspadaFuegoDecorator(guerrero); 

        // Se prueba su ataque frente al enemigo
        guerreroArmado.atacar(enemigo);

        // Verificación del daño adicional por la espada de fuego
        assertTrue(enemigo.getPuntosDeVida() <= 75, "El enemigo debió recibir el daño extra del fuego");
    }
}