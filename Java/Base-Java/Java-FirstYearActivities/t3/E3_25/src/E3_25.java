import java.util.Scanner;

public class E3_25 {

    public static void procedimiento (int radio, int altura){
        double pi= 3.14159;
        double area = 2*pi*radio*(radio*altura);
        double volumen = pi*(radio^2)*altura;
        System.out.println("Introduzca v para ver el volumen o a para ver el área: ");
        Scanner sc = new Scanner(System.in);
        String userval= sc.nextLine();
        switch (userval){
            case "v": System.out.println(volumen);
            break;
            case "a": System.out.println(area);
            break;
        }
        sc.close();


    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio: ");
        int radio = sc.nextInt();
        System.out.println("Introduzca la altura: ");
        int altura = sc.nextInt();
        E3_25.procedimiento(radio, altura);
        sc.close();
    }
}
