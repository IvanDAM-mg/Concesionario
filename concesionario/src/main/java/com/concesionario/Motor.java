package com.concesionario;

public class Motor {
    private String tipoMotor;
    private int numeroMotor;
    private String estadoMotor;
    private Potencia potencia;

    public Motor(String tipoMotor, int numeroMotor, String estadoMotor) {
        this.tipoMotor = tipoMotor;
        this.numeroMotor = numeroMotor;
        this.estadoMotor = estadoMotor;
    }
    
    public float calculaPrecio() {
        if(tipoMotor.equals("Diesel") && estadoMotor.equals("Nuevo"))
            return 500f*numeroMotor;
        else
            return 250f;
    }

    public void mostrarTipoMotor(){
        System.out.println("El tipo de motor es: " +tipoMotor);
    }
    
    public void mostrarEstadoMotor(){
        System.out.println("El estado del motor es: " +estadoMotor);
    }
    
    public void mostrarPropietario(Propietario propietario){
        System.out.println("El propietario del motor es: " +propietario);
    }
    
    public void mostrarPotencia(Potencia potencia){
        System.out.println("La potencia del motor es de: " +potencia);
    }
    public void mostrarPiezas(){
        System.out.println("El motor lleva varios: engranajes, cilindros, bujias y pistones");
    }
    public void mostrarCoche(Coche coche){
        System.out.println("El Coche que contiene este motor es: " +coche);
    }
    public String getTipoMotor() {
        return tipoMotor;
    }
    public String getEstadoMotor() {
        return estadoMotor;
    }
    public int getNumeroMotor() {
        return numeroMotor;
    }
    public Potencia getPotencia() {
        return potencia;
    }
}
