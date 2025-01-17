package org.example;
public class Circulo extends FiguraGeometrica{
    double radio;
    final double pi = 3.141592;

    //constructores
    public Circulo (int x, int y, double radio){
        super(x, y);
        this.radio = radio;
    }

    //metodos

    public double area(){return Math.PI*Math.pow(radio,2);}
    public double perimetro(){return 2*Math.PI*radio;}
    public String mostrar(){return ("Area: " + " Perimetro: ");}
}
