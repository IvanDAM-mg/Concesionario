package com.concesionario;

/**com.concesionario.App
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Coche c1 = new Coche("BMW","M3",2009,2024);
        c1.toString();
        Propietario p1 = new Propietario("Felipe","Perez","01212126X",27);
        p1.toString();
        Potencia po1 = new Potencia(120890,112);
        Motor m1 = new Motor("Diesel",19,"Perfecto");
        m1.mostrarTipoMotor();
        m1.mostrarEstadoMotor();
        m1.mostrarPropietario(p1);
        m1.mostrarPotencia(po1);
        m1.mostrarPiezas();
        m1.mostrarCoche(c1);
    }
}
