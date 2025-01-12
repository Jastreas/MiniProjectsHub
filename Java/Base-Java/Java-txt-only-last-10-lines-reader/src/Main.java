import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        LinkedList <String> list;
        String s;

        System.out.println("Introduzca el nombre del archivo: ");

        try {
            file = new File(sc.next());
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            list = new LinkedList<String>();

            try{
                for(int i = 0; (s = bufferedReader.readLine()) != null ; i++){
                    list.add(s);

                    if(list.size() > 10){
                        list.removeFirst();
                    }
                }

                for(String lines : list){
                    System.out.println(lines);
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