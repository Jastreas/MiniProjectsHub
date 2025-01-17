package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Empleado extends Persona{
private double sueldo;
public Empleado(String nombre, int edad){
    super(nombre, edad);
    this.sueldo=0;
}

public Empleado(String nombre, int edad, double sueldo){
    super(nombre, edad);
    this.sueldo = 0;
}


public void cargar(){
    Scanner sc = new Scanner(System.in);
    super.cargar();
    System.out.println("Dime el sueldo: ");
    sueldo = sc.nextDouble();
}

public void imprimir(){

    super.imprimir();
    System.out.println("Sueldo: " + sueldo);
}
}

