package com.concesionario;

public class Propietario {
    private String nombre;
    private String apellidos;
    private String DNI;
    private int edad;

    public Propietario(String nombre, String apellidos, String DNI, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", edad=" + edad + '}';
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDNI() {
        return DNI;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    
}
