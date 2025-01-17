public class Rectangulo{
    private double lado_largo;
    private double lado_corto;

    public Rectangulo(){
        lado_largo = 1;
        lado_corto = 1;
    }

    public Rectangulo(double ladoCorto, double ladoLargo){
        this.lado_corto = ladoCorto;
        this.lado_largo = ladoLargo;
    }

    public double getLado_corto() {
        return lado_corto;
    }

    public double getLado_largo() {
        return lado_largo;
    }

    public void setLado_corto(double lado_corto) {
        this.lado_corto = lado_corto;
    }

    public void setLado_largo(double lado_largo) {
        this.lado_largo = lado_largo;
    }

    public double perimetro (){
        double res=0;
        res = ((lado_corto*2)+(lado_largo*2));
        return res;
    }

    public double area(){
        return lado_corto*lado_largo;
    }

}
