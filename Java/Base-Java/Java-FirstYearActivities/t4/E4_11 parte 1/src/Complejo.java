public class Complejo {
    double real, imaginario;

    //----Constructores----

    //por defecto a 0

    public Complejo(){
        real = 0;
        imaginario = 0;
    }
    //real a n de usuario e imaginario a 0
    public Complejo(double real){
        this.real = real;
        imaginario = 0;
    }
    //real e imaginario a numeros de usuario
    public Complejo(double real, double complejo){
        this.real = real;
        this.imaginario = complejo;
    }

    //----Setters y Getters----
    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginario() {
        return imaginario;
    }
    public double getReal() {
        return real;
    }

    //----Métodos----
        //sumar:
    public Complejo sumar(Complejo x){
        double nrc = (this.real + x.real);
        double nri = (this.imaginario+ x.imaginario);
        Complejo y = new Complejo(nrc, nri);
        return y;
    }
    //restar
    public Complejo restar(Complejo x){
        double nrc = (this.real - x.real);
        double nri = (this.imaginario - x.imaginario);
        Complejo y = new Complejo(nrc, nri);
        return y;
    }
     //multiplicar por otro complejo
    public Complejo multiplicar(Complejo x){
        double nrc = ((this.real * x.real)-(this.imaginario * x.imaginario));
        double nri = ((this.real * x.imaginario)+(this.imaginario*x.real));
        Complejo y = new Complejo(nrc, nri);
        return y;
    }
    //multiplicar por n
    public Complejo multiplicar2(double x){
        double nrc = (this.real * x);
        double nri = (this.imaginario * x);
        Complejo y = new Complejo(nrc, nri);
        return y;
    }
    //dividir
    public Complejo dividir(Complejo x){
        double nrc = (((this.real * x.real)+(this.imaginario*x.imaginario))/(Math.pow(x.real,2)+(Math.pow(x.imaginario,2))));
        double nri = (((this.imaginario * x.real)-(this.real * x.imaginario))/(Math.pow(x.real,2)+(Math.pow(x.imaginario,2))));
        Complejo y = new Complejo(nrc, nri);
        return y;
    }
    //tostring
    @Override
    public String toString() {
        return "(" + real + ", " + imaginario + ")";
    }


}
