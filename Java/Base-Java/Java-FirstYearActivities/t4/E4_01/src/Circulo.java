public class Circulo {

    private double radio = 0;

    //constructores
    public Circulo(){
    radio = 1;
    }

    public Circulo(double radio){
        //el atributo de esta clase (el general) se el que quiero cambiar con el parametro.
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
 }
    public void /*double*/ setRadio(double radio) {
        this.radio = radio;
    }

    public double perimetro(/*no hace falta declarar pq existe THIS.radio*/double radio){
        //funciona pero no es correcto 
        double res;
        radio = this.radio;
        res = 2*3.14159*radio;
        return res;
    }
        /*
        --- lo mas corto: ---
        return 2*Math.PI*this.radio;
        */
    public double area(){
        return (Math.PI*this.radio*this.radio);
    }
    
}