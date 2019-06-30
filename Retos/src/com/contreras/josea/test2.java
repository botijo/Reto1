package com.contreras.josea;

public class test2 {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        Coche coche1 = new Coche("FORD",9000,55000);
        Coche coche2 = new Coche("FORD",7500,82000);
        Coche coche3 = new Coche("FORD",9100,82000);
        Coche coche4 = new Coche("PEUGEOT",8200,62000);
        Coche coche5 = new Coche("PEUGEOT",9100,70000);
        concesionario.nuevoCoche(coche1);
        concesionario.nuevoCoche(coche2);
        concesionario.nuevoCoche(coche3);
        concesionario.nuevoCoche(coche4);
        concesionario.nuevoCoche(coche5);

        mostrarDatos(concesionario);
    }

    public static void mostrarDatos(Concesionario concesionario){
        System.out.println("----------------------------\nCoches del Concesionario");
        for (Coche coche :concesionario.getListadosorted()) {
            System.out.println(coche.toString());
        }
    }
}
