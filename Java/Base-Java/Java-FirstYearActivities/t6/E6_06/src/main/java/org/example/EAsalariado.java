package org.example;
import java.util.Calendar;
public class EAsalariado extends Empleado {

    private double sueldoBase;
    public EAsalariado(){}

    public EAsalariado(int Dni, int añoIng, String nombre, String apellido, double sb){
        super(Dni,añoIng,nombre,apellido);
        sueldoBase = sb;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double obtenerSalario(){
        Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        int ant = year-añoIngreso;
        int porc;
        if (ant < 2){
            porc = 0;
        } else if (ant == 2 || ant == 3){
            porc = 5;
        } else if (ant >= 4 && ant <= 7){
            porc = 10;
        } else if (ant >= 8 && ant <= 15){
            porc = 15;
        } else {
            porc = 20;
        }
        return porc;
    }


    @Override
    public void imprimir(){
        System.out.println(name+" "+surN+", DNI: "+nDni+ ", desde "+añoIngreso +
                ", salario fijo base = "+sueldoBase + "€, Salario total: "+obtenerSalario()+"€");}


}
