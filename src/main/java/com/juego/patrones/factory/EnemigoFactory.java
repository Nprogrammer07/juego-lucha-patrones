package com.juego.patrones.factory;
import com.juego.model.Personaje;
import com.juego.model.JefeDragon;
import com.juego.model.JefeSupermutante;


public class EnemigoFactory{

    public static Personaje crearEnemigo(String tipo, String nombre){
        
        // Aquí se deberá escribir el jefe a crear:
        if (tipo.equalsIgnoreCase("DRAGON")){
            return new JefeDragon(nombre);
        } else if (tipo.equalsIgnoreCase("SUPERMUTANTE")){
            return new JefeSupermutante(nombre);
        }

        // Si el jefe escrito no coincide, se creará un enemigo genérico usando el constructor base
        return new Personaje(nombre);

    }
}