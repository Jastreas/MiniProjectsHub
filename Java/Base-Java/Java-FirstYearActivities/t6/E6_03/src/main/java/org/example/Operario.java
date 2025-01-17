package org.example;

public class Operario extends Empleado{
    //constructor
    public Operario(String nombre){
        super(nombre);
    }
    //to string


    @Override
    public String toString() {
        return ("Empleado " + getNombre() + " --> Operario");
    }
}
