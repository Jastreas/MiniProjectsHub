import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombrearchivo;
        Scanner sc = new Scanner(System.in);
        File f;
        FileReader fr;
        int n;
        int clinea = 1;
        char a;
        char[] ar;
       // System.out.println("Introduce el nombre del arcchivo: ");
       // f = new File(nombrearchivo = sc.next());
        f = new File("archivo.txt");

        if (f.exists()) {
            if (f.length() != 0) {
                try {
                    fr = new FileReader(f);
                    System.out.printf("Línea: " + clinea + " ");
                    while ((n = fr.read()) != -1) {
                        a = (char) n;
                        System.out.printf(String.valueOf(a));
                        if (a == '\n') {
                            clinea += 1;
                            System.out.printf("Línea: " + clinea + " ");
                        }
                    }
                   fr.close();
                } catch (IOException ioE) {
                    System.err.println("Ha ocurrido algún error de entrada o salida.");
                }
            } else {
                System.err.println("El fichero introducido está vacío");
            }
        } else {
            System.err.println("El nombre del archivo es incorrecto o no existe.");
        }
    }
}