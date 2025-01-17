package org.example;

public abstract class Empleado {
    protected int nDni;
    protected int añoIngreso;
    protected String name;
    protected String surN;


    public Empleado(){}

    public Empleado(int dni, int año, String nombre, String apellido){
        this.nDni = dni;
        this.añoIngreso = año;
        this.name = nombre;
        this.surN = apellido;
    }
    public int getAñoIngreso() {
        return añoIngreso;
    }
    public int getnDni() {
        return nDni;
    }
    public String getName() {
        return name;
    }
    public String getSurN() {
        return surN;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setnDni(int nDni) {
        this.nDni = nDni;
    }
    public void setSurN(String surN) {
        this.surN = surN;
    }

    public abstract void imprimir();
    public abstract double obtenerSalario();


}


