package com.juego.main;

import com.juego.model.Personaje;
import com.juego.model.*;
import com.juego.patrones.factory.EnemigoFactory; 


// Importamos el modelo base y la fábrica que creamos
import com.juego.model.Personaje;
import com.juego.patrones.factory.EnemigoFactory;

// Importación de Abstract Factory
import com.juego.patrones.abstractfactory.FaccionFactory;
import com.juego.patrones.abstractfactory.FabricaLuz;
import com.juego.patrones.abstractfactory.FabricaOscura;

// Importación del Builder
import com.juego.patrones.builder.PersonajeBuilder;

// Import del Decorator
import com.juego.patrones.decorator.EspadaFuegoDecorator;



public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   BIENVENIDO AL JUEGO DE LUCHA RPG     ");
        System.out.println("=========================================\n");

        // 1. INTEGRACIÓN ABSTRACT FACTORY
        // En lugar de "new Personaje", elegimos una fábrica (esto simula la elección de facción del jugador)
        FaccionFactory miFaccion = new FabricaOscura(); 
        
        // 2. USO DEL PATRON BUILDER
        Personaje heroePersonalizado = new PersonajeBuilder()
            .conNombre("Thor el Valiente")
            .conVida(250)
            .build();

        System.out.println("[HÉROE PERSONALIZADO]: " + heroePersonalizado.getNombre());
        
        System.out.println("[HÉROE CREADO POR FÁBRICA]: " + heroePersonalizado.getNombre() + " con " + heroePersonalizado.getPuntosDeVida() + " HP.\n");

        Personaje heroe = new PersonajeBuilder()
            .conNombre("Zeus")
            .conVida(300)
            .build();

        heroe = new EspadaFuegoDecorator(heroe);

        System.out.println("EQUIPAMIENTO: " + heroe.getNombre() + " ha equipado la Espada de Fuego.");

        // 3. USO DEL PATRÓN 1: FACTORY METHOD
        // La fábrica se encarga de decidir qué subclase instanciar
        System.out.println("--- ¡UN JEFE HA APARECIDO EN LA MAZMORRA! ---");
        Personaje jefe = EnemigoFactory.crearEnemigo("DRAGON", "Smaug el Terrible");
        System.out.println("[JEFE APARECIDO]: " + jefe.getNombre() + " con " + jefe.getPuntosDeVida() + " HP.\n");

        // 4. SIMULACIÓN DE COMBATE CORTO (Bucle de turnos simple)
        System.out.println("--- INICIA EL COMBATE POR TURNOS ---");
        int ronda = 1;

        while (heroePersonalizado.estaVivo() && jefe.estaVivo() && ronda <= 3) {
            System.out.println("\n--- Ronda " + ronda + " ---");
            
            // Turno del héroe
            heroePersonalizado.atacar(jefe);
            
            // Verificar si el jefe sigue vivo antes de que contraataque
            if (jefe.estaVivo()) {
                jefe.atacar(heroePersonalizado);
            }
            
            ronda++;
        }

        // 5. RESULTADO DE LA SIMULACIÓN
        System.out.println("\n=========================================");
        System.out.println("      ESTADO FINAL DE LA SIMULACIÓN      ");
        System.out.println("=========================================");
        System.out.println(heroePersonalizado.getNombre() + ": " + (heroePersonalizado.estaVivo() ? heroePersonalizado.getPuntosDeVida() + " HP" : "DEFEATED"));
        System.out.println(jefe.getNombre() + ": " + (jefe.estaVivo() ? jefe.getPuntosDeVida() + " HP" : "DEFEATED"));
        System.out.println("=========================================");
    }
}