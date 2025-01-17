package org.example;

public class Cuadrado extends Rectangulo{
    //constructor
    public Cuadrado(int x, int y){
        super(x, y);
    }

    //metodos

    public double area() {
        return l1 *= 4;
    }

    public double perimetro(){
        return l1 * l1;
    }

    public String mostrar(){return ("Area: " + " Perimetro: ");}
}
