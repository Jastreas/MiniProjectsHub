public class Fraccion {
    //---- Atributos ----
    int num, den;

    //---- Constructores ----
    //por defecto
    public Fraccion(){
        this.num = 0;
        this.den = 1;
    }
    //constructor con parametros
    public Fraccion(int num, int den){
        this.num = num;
        this.den = den;
    }
    //funcion para hacer num/1
    public Fraccion(int num){
        this.num = num;
        this.den = 1;

    }

    //---- Metodos ----

    //- sets y gets -
    public int getDen() {
        return den;
    }
    public int getNum() {
        return num;
    }
    public void setDen(int den) {
        this.den = den;
    }
    public void setNum(int num) {
        this.num = num;
    }


    //- suma -
    public Fraccion sumar(Fraccion f2){
        int nume, deno, nume2;
        int mcm = mcm(this.den, f2.den);
        Fraccion n = new Fraccion();

        if (this.den == f2.den){
            n.setDen(this.den);
            n.setNum(this.num-f2.num);
            return n;
        } else {
            nume = (mcm/this.den)*this.num;
            nume2 = (mcm/f2.den)*f2.num;
            deno = mcm;
            n.setNum(nume+nume2);
            n.setDen(mcm);
            return n;
        }
    }
    // - resta -
    public Fraccion restar(Fraccion f3){
        int nume, deno, nume2;
        Fraccion n = new Fraccion();

        if (this.den == f3.den){
            nume = this.num - f3.num;
            deno = this.den;
            n.setNum(nume);
            n.setDen(deno);
            return n;
        } else {
            int mcm = mcm(this.den, f3.den);
            nume =  (mcm(this.den, f3.den)/f3.den)*this.num;
            nume2 =  (mcm(this.den, f3.den)/f3.den)*this.num;
            n.setNum(nume-nume2);
            n.setDen(mcm);
            return n;
        }
    }

    // - Multiplicar -

    public Fraccion multiplicar (Fraccion f4){
        int nume, deno;
        Fraccion x = new Fraccion();

        nume = this.num*f4.num;
        deno = this.den*f4.den;
        x.setNum(nume);
        x.setDen(deno);

        return x;
    }

    // - Dividir -

    public Fraccion dividir (Fraccion f2){
        int nume, deno;
        Fraccion x = new Fraccion();

        nume =  this.num*f2.den;
        deno = this.den*f2.num;

        x.setNum(nume);
        x.setDen(deno);
        return x;

    }






    //mcm
    private int mcm(int num1, int num2) {
        int mcm = 1;
        int i = 2;

        while (num1 > 1 && num2 > 1) {
            if (num1 % i == 0 && num2 % i == 0) {
                mcm *= i;
                num1 /= i;
                num2 /= i;
            } else {
                i++;
            }
        }

        return mcm * num1 * num2;
    }




}
