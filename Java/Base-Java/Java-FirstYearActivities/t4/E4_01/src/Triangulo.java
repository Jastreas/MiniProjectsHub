public class Triangulo {


    private double base, altura;

    public Triangulo() {
        base = 1;
        altura = 1;
    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setBase(double numUser){
      this.base = numUser;
    }

    public void setAltura(double numUser){
        this.altura = numUser;
    }


    public double perimetro(){
        double h = 0;
        h = Math.sqrt(this.base) + Math.sqrt(this.altura);
        return h;
    }


}

