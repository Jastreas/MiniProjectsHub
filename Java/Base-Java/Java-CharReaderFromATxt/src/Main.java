import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f;
        FileReader fr;
        BufferedReader bfr;
        int cont = 0;

        //System.out.println("Introduce the name or location of your file: ");
        //f = new File(sc.next());

        f = new File("Ejemplo.txt");
        try {
            if (f.exists()) {
                fr = new FileReader(f);
                bfr = new BufferedReader(fr);
                int c;
                while((c = bfr.read()) != -1){
                    cont++;
                }
                System.out.println(cont);
            } else {
                throw new IOException();
            }
        } catch (IOException ioe){
            System.err.println("Your file doesn't exist");
        }

    }

}

