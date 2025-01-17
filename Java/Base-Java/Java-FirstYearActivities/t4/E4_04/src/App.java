import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca un dni: ");
        Scanner sc = new Scanner(System.in);
        int DNIusr = sc.nextInt();
        System.out.println("esto es intermedio (introduce un valor para continuar :))");
        sc.next();
        Nif prueba = new Nif(DNIusr);
        prueba.Leer(DNIusr);
        prueba.aString();
        sc.close();

        


    }
}
