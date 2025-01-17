package org.example;

public class DividePorCero extends Exception{
    int num,den;

    public DividePorCero(int n, int d){
        this.num = n;
        this.den = d;
    }

    public int operar(){
        int ras;
        try {
            int res;
            res = num / den;
            ras = res;
            return  res;
        } catch (Exception e) {
            System.out.println("No puedes dividir un numero entre 0" + e);
            return 0;}
    }

}
