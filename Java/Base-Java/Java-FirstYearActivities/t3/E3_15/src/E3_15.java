import java.util.Scanner;

public class E3_15 {
    public static void main(String[] args) throws Exception {
        int promedio = 0, edad = 0, nedades = 1, edadant = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Indique la edad: ");
            edad = sc.nextInt();
            nedades++;
            promedio = (edadant + edad) / nedades;

        } while (promedio <= 25);

        System.out.println("Se acabó");
    }
}
