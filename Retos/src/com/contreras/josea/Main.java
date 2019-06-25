package com.contreras.josea;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente1 = new Cliente("Juan",18000);
        Cliente cliente2 = new Cliente("Pedro",10000);

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


        mostrarDatos(cliente1, cliente2, concesionario);

        System.out.println("\n\n");
        concesionario.comprarChoce(cliente1, coche2);
        mostrarDatos(cliente1, cliente2, concesionario);

        System.out.println("\n\n");
        concesionario.comprarChoce(cliente2, coche4);
        mostrarDatos(cliente1, cliente2, concesionario);

        System.out.println("\n\n");
        concesionario.comprarChoce(cliente1, coche5);
        mostrarDatos(cliente1, cliente2, concesionario);

        System.out.println("\n\n");
        concesionario.comprarChoce(cliente2, coche2);
        mostrarDatos(cliente1, cliente2, concesionario);

        System.out.println("\n\n");
        concesionario.comprarChoce(cliente1, coche1);
        mostrarDatos(cliente1, cliente2, concesionario);



    }

    public static void mostrarDatos(Cliente cliente1, Cliente cliente2, Concesionario concesionario){
        System.out.println("Coches del cliente 1");
        for (Coche cocheC1 : cliente1.getListaCoches()){
            System.out.println(cocheC1.toString());
        }
        System.out.println("----------------------------\n Coches del cliente 2");
        for (Coche cocheC2 : cliente2.getListaCoches()){
            System.out.println(cocheC2.toString());
        }
        System.out.println("----------------------------\nCoches del Concesionario");
        for (Coche coche :concesionario.getListadosorted()) {
            System.out.println(coche.toString());
        }
    }
}
