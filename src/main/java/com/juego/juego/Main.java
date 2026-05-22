package com.juego.main;

import com.juego.model.Personaje;
import com.juego.model.*;
import com.juego.patrones.factory.EnemigoFactory; 


// Importamos el modelo base y la fábrica que creamos
import com.juego.model.Personaje;
import com.juego.patrones.factory.EnemigoFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   BIENVENIDO AL JUEGO DE LUCHA RPG     ");
        System.out.println("=========================================\n");

        // 1. Creamos al héroe usando el constructor base por ahora
        // (Luego aquí usaremos el patrón Builder)
        Personaje heroe = new Personaje("Thor");
        System.out.println("[HÉROE CREADO]: " + heroe.getNombre() + " con " + heroe.getPuntosDeVida() + " HP.\n");

        // 2. USO DEL PATRÓN 1: FACTORY METHOD
        // La fábrica se encarga de decidir qué subclase instanciar
        System.out.println("--- ¡UN JEFE HA APARECIDO EN LA MAZMORRA! ---");
        Personaje jefe = EnemigoFactory.crearEnemigo("DRAGON", "Smaug el Terrible");
        System.out.println("[JEFE APARECIDO]: " + jefe.getNombre() + " con " + jefe.getPuntosDeVida() + " HP.\n");

        // 3. SIMULACIÓN DE COMBATE CORTO (Bucle de turnos simple)
        System.out.println("--- INICIA EL COMBATE POR TURNOS ---");
        int ronda = 1;

        while (heroe.estaVivo() && jefe.estaVivo() && ronda <= 3) {
            System.out.println("\n--- Ronda " + ronda + " ---");
            
            // Turno del héroe
            heroe.atacar(jefe);
            
            // Verificar si el jefe sigue vivo antes de que contraataque
            if (jefe.estaVivo()) {
                jefe.atacar(heroe);
            }
            
            ronda++;
        }

        // 4. RESULTADO DE LA SIMULACIÓN
        System.out.println("\n=========================================");
        System.out.println("      ESTADO FINAL DE LA SIMULACIÓN      ");
        System.out.println("=========================================");
        System.out.println(heroe.getNombre() + ": " + (heroe.estaVivo() ? heroe.getPuntosDeVida() + " HP" : "DEFEATED"));
        System.out.println(jefe.getNombre() + ": " + (jefe.estaVivo() ? jefe.getPuntosDeVida() + " HP" : "DEFEATED"));
        System.out.println("=========================================");
    }
}