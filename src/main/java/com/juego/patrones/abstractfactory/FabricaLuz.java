package com.juego.patrones.abstractfactory;

import com.juego.patrones.abstractfactory.FaccionFactory;
import com.juego.model.Mago;
import com.juego.model.MagoBlanco;
import com.juego.model.Arquero;
import com.juego.model.ArqueroElite;


public class FabricaLuz implements FaccionFactory{ 

    // La fabrica de luz crea al mago blanco y al arquero de élite

    @Override
    public Mago crearMago(String nombre){
        return new MagoBlanco(nombre); 
    }

    @Override
    public Arquero crearArquero(String nombre){
        return new ArqueroElite(nombre);
    }
}