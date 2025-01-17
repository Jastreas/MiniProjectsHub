import java.util.Scanner;

public class E4_01 {
        public static void main(String[] args) throws Exception {
        /* 
        System.out.println("Introduzca el numero que quiera como radio: ");
        Scanner sc = new Scanner(System.in);
        double radio_user = sc.nextDouble();

        Circulo c = new Circulo();
        c.setRadio(radio_user);
        System.out.println(c.getRadio());
        System.out.println(c.perimetro(radio_user));
        System.out.println(c.area());

        sc.close();
        */
        Triangulo t = new Triangulo();
        System.out.println("Introduzca el valor de su l1: ");
        Scanner sc = new Scanner(System.in);
        double l1 = sc.nextDouble();
        t.setBase(l1);
        System.out.println("Introduzca el valor de su l2: ");
        double l2 = sc.nextDouble();
        t.setAltura(l2);
        
        
        System.out.println("el valor del lado corto es: " + t.getBase());
        System.out.println("el valor del lado largo es: " + t.getAltura());
        System.out.println("El valor del perimetro es: "+ t.perimetro());
        sc.close();
    }
}
