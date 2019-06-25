package com.contreras.josea;

public class Coche {
    private String marca;
    private Integer precio;
    private Integer numKms;

    public Coche(String marca, Integer precio, Integer numKms) {
        this.marca = marca;
        this.precio = precio;
        this.numKms = numKms;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getNumKms() {
        return numKms;
    }

    public void setNumKms(Integer numKms) {
        this.numKms = numKms;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", numKms=" + numKms +
                '}';
    }
}
