package org.example;

public class Empleado {
    protected String nombre_apellido;
    protected String cedula;
    protected String clasificacion;
    protected int edad;
    protected boolean casado;
    protected double salario;

    //constructores

    public Empleado(){}

    public Empleado(String nya, String ced, int e, boolean cas, double sal){
        nombre_apellido = nya;
        cedula = ced;
        edad = e;
        casado = cas;
        salario = sal;
    }

    //metodo para mostrar clasificacion por edades

    public void Mostrar(){
        if (edad <= 21){
            clasificacion = "Principiante";
        } else if (edad >= 22 && edad <= 35){
            clasificacion = "Intermedio";
        } else {
            clasificacion = "Senior";
        }
    }
    //To string / mostrar
    @Override
    public String toString() {
        return ("Nombre y Apellido: " + nombre_apellido + "\nCedula: " + cedula + "\nedad: " + edad + "\ncasado: " + casado + "\nsalario: " + salario);
    }
    //Aumentar salario
    public void aumentar(int aumento){
        salario += aumento;
    }
    
}
