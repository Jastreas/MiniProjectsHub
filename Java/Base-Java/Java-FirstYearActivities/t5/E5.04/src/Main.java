public class Main {
    public static void main(String[] args) {

    Altura alt = new Altura();
    Altura alt2 = new Altura(1,2,3,4,5);

        alt.cargar();
        alt2.cargar();

        System.out.println(alt.calcularPromedio());
        System.out.println(alt2.calcularPromedio());
        System.out.println(alt.mayoresPromedio());
        System.out.println(alt2.mayoresPromedio());
        System.out.println(alt.menoresPromedio());
        System.out.println(alt2.menoresPromedio());
        
    }
}