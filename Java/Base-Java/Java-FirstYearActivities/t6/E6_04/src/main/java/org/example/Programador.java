package org.example;

public class Programador extends Empleado {
    int lineasDeCodigoPorHora;
    String lenguajeDominante;

    //constructores
    public Programador(){}

    public Programador(String nya, String ced, int e, boolean cas, double sal, int ldcph, String ld){
        super(nya, ced, e, cas, sal);
        lineasDeCodigoPorHora = ldcph;
        lenguajeDominante = ld;
    }

    //metodo para stringear


    @Override
    public String toString() {
        return ("Nombre y Apellido: " + nombre_apellido + "\nCedula: " + cedula + "\nedad: " + edad + "\ncasado: " + casado + "\nsalario: " + salario + "\nLineas por hora: " + lineasDeCodigoPorHora + "\nLenguaje dominante: " + lenguajeDominante);
    }
}
