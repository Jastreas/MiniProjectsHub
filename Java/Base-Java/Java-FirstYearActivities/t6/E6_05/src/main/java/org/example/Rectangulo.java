package org.example;

public class Rectangulo extends FiguraGeometrica {
    protected double l1;
    protected double l2;

    //const
    public Rectangulo(int x, int y){
        super(x, y);
        l1 = 0;
        l2 = 0;
    }

    public Rectangulo(double lu1, double lu2, int x, int y){
        super(x, y);
        l1 = lu1;
        l2 = lu2;
    }

    //metodos

    public double area(){
        return l1 *= 4;
    }

    public double perimetro(){ return (l1 * l1);}

    public String mostrar(){return ("Area: " + area() + " Perimetro: " + perimetro());}

}
