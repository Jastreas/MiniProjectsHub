package org.example;

public class ArrayReales implements Estadísticas{
    protected double[] vector;

    public ArrayReales(){
        for (int i=0; i<5; i++){
            vector[i] = 1+vector[i];
        }
    }

    @Override
    public double minimo(){
        return vector[1];
    }
    @Override
    public double maximo(){
        return vector[4];
    }
    @Override
    public double sumatorio(){
        return vector[1]+vector[2]+vector[3]+vector[4]+vector[5];
    }


}
