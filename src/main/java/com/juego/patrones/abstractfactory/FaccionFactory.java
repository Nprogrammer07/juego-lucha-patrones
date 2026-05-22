package com.juego.patrones.abstractfactory;

import com.juego.model.Mago;
import com.juego.model.Arquero;

public interface FaccionFactory { // Se usan interfaces para tener un estándar en las clases, en este caso, creación del personaje
    Mago crearMago(String nombre);
    Arquero crearArquero(String nombre);
}