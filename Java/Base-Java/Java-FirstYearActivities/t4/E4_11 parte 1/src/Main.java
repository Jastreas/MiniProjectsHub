public class Main {
    public static void main(String[] args) {
    Complejo a = new Complejo(2,5);
    Complejo b = new Complejo();
    b.setReal(4.6);
    b.setImaginario(3.5);
    Complejo suma = a.sumar(b);
    Complejo resta = a.restar(b);
    Complejo mult = a.multiplicar(b);
    Complejo mult2 = a.multiplicar2(5.2);
    Complejo div = a.dividir(b);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);
        System.out.println(mult2);
        System.out.println(div);
    if (a.equals(b)){
        System.out.println("Los dos numeros son iguales.");
    }
    }
}