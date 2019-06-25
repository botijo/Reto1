package com.contreras.josea;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private Integer presupuesto;
    private List<Coche> listaCoches;

    public Cliente(String nombre, Integer presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.listaCoches = new ArrayList<Coche>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Integer presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Coche> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(List<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

}
