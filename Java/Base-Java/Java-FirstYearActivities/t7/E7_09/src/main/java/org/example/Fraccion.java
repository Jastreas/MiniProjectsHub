package org.example;

public class Fraccion {
    protected double num,den;

    public Fraccion(double n, double d) throws Excepcion{
        this.den = d;
        this.num = n;
    }

    //---Metodos---

    //sumar
    public Fraccion sumar (Fraccion b){
        double nres, dres;

        try {
            nres = (this.num * b.den) + (this.den * b.num);
            dres = (this.den * b.den);
            Fraccion res = new Fraccion(nres, dres);
            return res;
         } catch (Excepcion e){
            System.out.println("Algun valor introducido está mal." + e);
            return null;
        }
    }

    public Fraccion resta (Fraccion b){
        try {
            double nres, dres;
            nres = (this.num * b.den) - (this.den * b.num);
            dres = (this.den * b.den);
            Fraccion res = new Fraccion(nres, dres);
            return res;
        } catch (Excepcion e){
            System.out.println("Algun valor introducido está mal." + e);
            return null;
        }
    }


    public Fraccion multiplicacion (Fraccion b){
        try {
            double nres, dres;
            nres = this.num * b.num;
            dres = this.den * b.den;
            Fraccion res = new Fraccion(nres, dres);
            return res;
        } catch (Excepcion e) {
            System.out.println("Algun valor introducido está mal." + e);
            return null;
        }
    }

    public Fraccion division (Fraccion b){
        try {
            double nres, dres;
            nres = this.num * b.den;
            dres = this.den * b.num;
            Fraccion res = new Fraccion(nres, dres);
            if (dres == 0) {
                throw new Excepcion("Esta cometiendo un error");
            } else {
                return res;
            }
        } catch (Excepcion e){
            System.out.println("Algun valor introducido está mal." + e);
            return null;
        }
    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "num=" + num +
                ", den=" + den +
                '}';
    }
}
