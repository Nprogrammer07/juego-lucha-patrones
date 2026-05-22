package com.juego.patrones.abstractfactory;

import com.juego.model.Mago;
import com.juego.model.Arquero;
import com.juego.model.MagoOscuro;
import com.juego.patrones.abstractfactory.FaccionFactory;
import com.juego.model.MagoBlanco;
import com.juego.model.ArqueroElite;
import com.juego.model.ArqueroInmortal;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class FaccionFactoryTest {

    // Testing del patrón abstract factory

    @Test
    @DisplayName("FabricaOscura debe producir un MagoOscuro y un ArqueroInmortal")
    void testFabricaOscura() {

        FaccionFactory fabrica = new FabricaOscura();

        Mago mago = fabrica.crearMago("Voldemort");
        Arquero arquero = fabrica.crearArquero("Orión");

        assertNotNull(mago);
        assertTrue(mago instanceof MagoOscuro, "Debería ser un MagoOscuro");

        assertNotNull(arquero);
        assertTrue(arquero instanceof ArqueroInmortal, "Debería ser un ArqueroInmortal");
    }

    @Test
    @DisplayName("FabricaLuz debe producir un MagoBlanco y ArqueroElite")
    void testFabricaLuz() {

        FaccionFactory fabrica = new FabricaLuz();

        Mago mago = fabrica.crearMago("Gandalf");
        Arquero arquero = fabrica.crearArquero("Cupido");

        assertNotNull(mago);
        assertTrue(mago instanceof MagoBlanco, "Debería ser un MagoBlanco");

        assertNotNull(arquero);
        assertTrue(arquero instanceof ArqueroElite, "Debería ser un ArqueroElite");
    }
}