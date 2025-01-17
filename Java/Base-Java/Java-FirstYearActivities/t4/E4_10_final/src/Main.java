public class Main {
    public static void main(String[] args) {

        //Declaracion de variables:

        Binario b = new Binario(); //constructor long por defecto
        Binario b2 = new Binario(0011011); //constructor que recibe long
        Binario b3 = new Binario(12); //constructor que recibe int y devuelve long en binario
        Binario b4 = new Binario("10011"); //variable string
        Binario b5s = new Binario(); // para comprobar sets y gets

        //comprobacion de constructores:
        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5s);

        //comprobacion de metodos:
        //set y get
        b5s.setN(10100);
        System.out.println(b5s.getN());

        //toDecimal
        System.out.println(b4);

        //esValido ---> mirar como hacer la comprobacion






    }
}