package com.juego.patrones.abstractfactory;

import com.juego.patrones.abstractfactory.FaccionFactory;
import com.juego.model.Mago;
import com.juego.model.Arquero;
import com.juego.model.MagoOscuro;
import com.juego.model.ArqueroInmortal;



public class FabricaOscura implements FaccionFactory {

    // La fabrica oscura crea al mago oscuro y al arquero inmortal.

    @Override
    public Mago crearMago(String nombre) {
        return new MagoOscuro(nombre); 
    }

    @Override 
    public Arquero crearArquero(String nombre){
        return new ArqueroInmortal(nombre);
    }
}