import java.util.Set;

/*
*/
public class Binario {
    //----Atributos----
    long n;


    //----Constructores----
    //-Por defecto-

    public Binario(){
        this.n = 0;
    }

    //-Por defecto con parametro long-
    public Binario(long num){
        String nBinario = Long.toBinaryString(num);
        this.n = Long.parseLong(nBinario);
    }
    //-constructor que recibe parametro int decimal y devuelve un long en binario-

    public Binario(int d){
        this.n = toBinario(d);
    }

    //-Recibe string binario y pasa a decimal
    public Binario(String s){
        this.n = toDecimal(s);
    }


    //---- Metodos ----


    //sets
    public void setN(long n) {
        this.n = n;
    }

    //get
    public long getN() {
        return this.n;
    }


    //-metodo toBinario- NO SE COMO CONVERTIR ESTO EN RECURSIVO NI PARA QUE LO QUERRIA
    private long toBinario (int n){
        String nb = Integer.toBinaryString(n);
        long nbl = Long.parseLong(nb);
        return nbl;
    }

    //metodo toDecimal que devuelve un int.
    public int toDecimal(String nb) {
        int decimalNumber = 0;
        for (int i = 0; i < nb.length(); i++) {
            if (nb.charAt(i) == '1') {
                decimalNumber += Math.pow(2, nb.length() - i - 1);
            }
        }
        return decimalNumber;
    }

    //metodo recursivo para comprobar si el numero es correcto 01001... que devuelva bool

    public boolean esValido (String n){
        if (n.length() == 0) {
            return true;
        }
        if (n.charAt(0) != '0' && n.charAt(0) != '1') {
            return false;
        }
        return esValido(n.substring(1));
    }

    @Override
    public String toString() {
        return Long.toString(this.n);
    }
}

    

