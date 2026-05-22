package com.juego.patrones;

import com.juego.model.Personaje;
import com.juego.patrones.factory.EnemigoFactory;
import com.juego.model.JefeDragon;
import com.juego.model.JefeSupermutante;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class EnemigoFactoryTest {

    // Testing del patrón Factory 

    @Test
    @DisplayName("Debe crear un JefeDragon correctamente")
    void testCrearDragon(){

        // Uso de la fábrica de enemigos:
        Personaje enemigo = EnemigoFactory.crearEnemigo("DRAGON", "CHIMUELO");

        // Verificaciones:
        assertNotNull(enemigo, " El enemigo creado no debería ser nulo");

        // Verificar que el objeto creado sea instancia de la clase JefeDragon
        assertTrue(enemigo instanceof JefeDragon, " Debería ser una instancia de JefeDragon.");
        assertEquals("CHIMUELO", enemigo.getNombre());
        assertEquals(300, enemigo.getPuntosDeVida(), " El drágon debe iniciar con 300 puntos de vida.");
    }

    @Test 
    @DisplayName("Debe crear un JefeSupermutante correctamente.")
    void testCrearSupermutante(){
        Personaje enemigo = EnemigoFactory.crearEnemigo("SUPERMUTANTE", "STRONG");

        assertNotNull(enemigo);
        assertTrue(enemigo instanceof JefeSupermutante, " Debería ser una instancia de JefeSupermutante.");
        assertEquals("STRONG", enemigo.getNombre());
        assertEquals(400, enemigo.getPuntosDeVida(), " El supermutante debe iniciar con 400 puntos de vida.");
    }

    @Test 
    @DisplayName("Debe crear un Personaje genérico si el tipo no coincide")
    void testCrearEnemigoDesconocido(){
        Personaje enemigo = EnemigoFactory.crearEnemigo("FRIEZANS", "Freezer");

        assertNotNull(enemigo);

        assertFalse(enemigo instanceof JefeDragon);
        assertFalse(enemigo instanceof JefeSupermutante);
        assertEquals("Freezer", enemigo.getNombre());
        assertEquals(150, enemigo.getPuntosDeVida(), " El enemmigo genérico debe tener la vida base de 150 puntos de vida.");
    }
}