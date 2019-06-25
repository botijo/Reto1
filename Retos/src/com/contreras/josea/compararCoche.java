package com.contreras.josea;

import java.util.Comparator;

public class compararCoche implements Comparator<Coche>{
    @Override
    public int compare(Coche o1, Coche o2) {
        Integer resultado = o1.getMarca().compareToIgnoreCase(o2.getMarca());
        if (resultado !=0){ return  resultado;}
        resultado = o1.getPrecio().compareTo(o2.getPrecio());
        if ( resultado!=0 ){ return  resultado;}
        resultado = o1.getNumKms().compareTo(o2.getNumKms());
        return resultado;
        }
}
