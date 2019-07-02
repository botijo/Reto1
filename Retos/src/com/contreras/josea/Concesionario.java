package com.contreras.josea;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Concesionario {
    SortedSet<Coche> listadosorted;

    public Concesionario() {
        //this.listadosorted =  new TreeSet<Coche>(new compararCoche());
        this.listadosorted =  new TreeSet<Coche>(new CocheComparator());
    }

    public  void nuevoCoche(Coche coche){
        listadosorted.add(coche);
    }

    public SortedSet<Coche> getListadosorted() {
        return listadosorted;
    }

    public void setListadosorted(SortedSet<Coche> listadosorted) {
        this.listadosorted = listadosorted;
    }

    public void comprarChoce(Cliente cliente, Coche coche) throws  IllegalArgumentException{
    	try {
            if(esVacio(cliente,coche)){
                throw new IllegalArgumentException("Argumento recibido nulo");
            }
            if (!esPudiente(cliente,coche)){
                throw new IllegalArgumentException("El cliente:"+ cliente.getNombre() +" no dispone suficiente dinero para comprar este coche");
            }
            if(!listadosorted.contains(coche)){
                throw new IllegalArgumentException("El coche no pertenece a este concesionario");
            }
            if(listadosorted.remove(coche)){
                List<Coche> temp = cliente.getListaCoches();
                temp.add(coche);
                cliente.setListaCoches(temp);
                cliente.setPresupuesto(cliente.getPresupuesto()-coche.getPrecio());
            }
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

    }

    public Boolean esVacio(Cliente cliente, Coche coche){
        if(cliente==null || coche==null){
            return  true;
        }
        if(cliente.getNombre().isEmpty() || cliente.getPresupuesto()==0){
            return  true;
        }
        if(coche.getMarca().isEmpty() || coche.getNumKms()==0 || coche.getPrecio()==0){
            return  true;
        }
        return false;
    }

    public Boolean esPudiente(Cliente cliente, Coche coche){
        if(cliente.getPresupuesto() < coche.getPrecio()){
            return false;
        }
        return  true;
    }



}
