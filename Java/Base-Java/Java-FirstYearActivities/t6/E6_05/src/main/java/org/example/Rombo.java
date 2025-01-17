package org.example;

public class Rombo extends FiguraGeometrica{
    double d_maj, d_min, lado, altura;

    //constructor
    public Rombo(int x, int y){
        super(x, y);
        d_maj = 0;
        d_min = 0;
        lado = 0;
    }

    public Rombo(int x, int y, double d_maj, double d_min, double lado){
        super(x, y);
        this.d_maj = d_maj;
        this.d_min = d_min;
        this.altura = altura;
    }

    //metodos

    public double area(){return ((d_min*d_maj)/2);}

    public double perimetro(){return (lado*4);}

    public String mostrar(){
        return ("Area: " + area() + "Perimetro: " + perimetro());
    }
}
