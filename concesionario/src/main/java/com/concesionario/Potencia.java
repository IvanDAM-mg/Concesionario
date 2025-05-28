package com.concesionario;

public class Potencia {
    private int Kilometraje;
    private int CV;

    public Potencia(int Kilometraje, int CV) {
        this.Kilometraje = Kilometraje;
        this.CV = CV;
    }

    @Override
    public String toString() {
        return "Potencia{" + "Kilometraje=" + Kilometraje + ", CV=" + CV + '}';
    }
    public int getCV() {
        return CV;
    }
    public int getKilometraje() {
        return Kilometraje;
    }
}
