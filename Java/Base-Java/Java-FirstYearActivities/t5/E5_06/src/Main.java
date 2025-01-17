import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un DNI: ");
        int nDni = sc.nextInt();
        int res = nDni %23;

        String []array = new String[] {"T", "R", "W", "A", "G", "M", "Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        System.out.println(nDni + "-" + array[res]);
    }
}