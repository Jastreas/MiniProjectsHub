package org.example;

public class Empleado {
    private String Nombre;

    //constructores

    public Empleado(){
        Nombre = null;
    }

    public Empleado(String nombre){
        this.Nombre = nombre;
    }

    //set y get
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getNombre() {
        return this.Nombre;
    }

    //tostring


    @Override
    public String toString() {
        return ("Empleado " + this.Nombre);
    }
}
