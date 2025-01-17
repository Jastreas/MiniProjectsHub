package org.example;

abstract public class FiguraGeometrica {
    protected int x;
    protected int y;

    public FiguraGeometrica(){}
    public FiguraGeometrica(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract double area();
    public abstract double perimetro();



}
