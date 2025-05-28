package com.concesionario;

public class Coche {
    private Propietario propietario;
    private Motor motor;
    private String marca;
    private String modelo;
    private int añoCoche;
    private int ultimaITV;


public Coche(String marca, String modelo, int añoCoche, int ultimaITV){
    this.marca = marca;
    this.modelo = modelo;
    this.añoCoche = añoCoche;
    this.ultimaITV = ultimaITV;
}

    @Override
    public String toString() {
        return "Coche{" + "propietario=" + propietario + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1oCoche=" + añoCoche + ", ultimaITV=" + ultimaITV + '}';
    }

    public String getMarca() {
        return marca;
    }
    public int getAñoCoche() {
        return añoCoche;
    }
    public String getModelo() {
        return modelo;
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public int getUltimaITV() {
        return ultimaITV;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
