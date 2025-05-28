package com.concesionario;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MotorTest {
    @Test
    public void calculaPrecio1Test() {
        Motor m=new Motor("Diesel",2,"Nuevo");
        float precio=m.calculaPrecio();
        assertEquals(1000f,precio,0.01f);
    }
    @Test
    public void calculaPrecio2Test() {
        Motor m=new Motor("Gasolina",2,"Viejo");

        assertEquals(250f,m.calculaPrecio(),0.01f);
    }
    @Test
    public void testCrearCoche(){
        Potencia potencia = new Potencia(200000, 400);
        Motor motor = new Motor("Gasolina", 2, "Nuevo");
        Propietario propietario = new Propietario("Juan", "Vazquez", "01212126X", 21);
        Coche coche = new Coche("BMW", "M4 Competition", 2020, 2025);

        assertEquals("BMW", coche.getMarca());
        assertEquals("Gasolina",coche.getMotor().getTipoMotor());
        assertEquals(150, coche.getMotor().getPotencia().getCV());
        assertEquals("Juan", coche.getPropietario().getNombre());
    }
    @Test
    public void testCambiarPropietario(){
        Propietario p1 = new Propietario("Luisa", "Fernandez", "03434345X", 25);
        Propietario p2 = new Propietario("Luis", "Perez", "0675432X", 31);
        Coche c1 = new Coche("Ford", "Fiesta", 2008, 2021);
        c1.setPropietario(p2);
        assertEquals("Luis", c1.getPropietario());
    }
}
