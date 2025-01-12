import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        String s;

        System.out.println("Introduzca el nombre del archivo: ");

        try {
            file = new File(sc.next());
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            try{
                for(int i = 1; i < 11; i++){
                    s = bufferedReader.readLine();
                    if (i == -1){break;}
                    System.out.println("Linea " + i + ": " + s);
                }
            } catch (IOException ioe){
                System.err.println("There was an I/O error");
                ioe.printStackTrace();
            }
        } catch (IOException ioe){
            System.err.println("File couldn't be found or doesn't exist");
            ioe.printStackTrace();
        }
    }
}