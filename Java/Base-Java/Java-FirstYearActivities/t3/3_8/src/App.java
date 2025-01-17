import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // usuario introduce nº preguntas realizadas y nº de preguntas correctas

        System.out.println("Introduzca la cantidad total de preguntas realizadas: ");
        Scanner sc = new Scanner(System.in);
        int preguntas = sc.nextInt();
        System.out.println("Introduzca la cantidad de preguntas que respondió correctamente: ");
        int respuestas = sc.nextInt();
        sc.close();

        // cálculo del porcentaje de respuestas correctas

        int porcentaje = ((respuestas * 100) / preguntas);
        System.out.println(porcentaje);

    }
}
