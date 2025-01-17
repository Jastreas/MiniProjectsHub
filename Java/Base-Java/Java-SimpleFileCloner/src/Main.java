//Read the comments for possible upgrades
//There are 2 types of archives you can try to clone: 1. Example.txt 2. Rufus.exe (it's kind of a big .exe, may take a bit)

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File fileInpFile = null;
        File fileOutpFile = null;
        String fileOutpName;
        boolean allGood = false;

        //Ask the name of the file to the user
        System.out.println("Introduce Name: (remember to add .extension)");

        //Load the file you want to clone
        try{
            fileInpFile = new File(sc.next());
            if (fileInpFile.exists()){
                System.out.println("File loaded succesfully");
                allGood = true;
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            System.err.println("No file detected with that name, remember to introduce the extension (.exe, .jpg, ...)");
        }

        //if the file was loaded well
        if(allGood) {
            //Ask for cloned name
            System.out.println("Please type the output name you'd like: ");
            fileOutpName = sc.next();

            // Add extension to clone file
            try {
                if ( fileOutpName.length() > 4) { //it should iterate till the last . and put userinput + whatever is next
                    String lastFourChars = fileOutpName.substring(fileOutpName.length() - 4);
                    fileOutpName = fileOutpName + lastFourChars;

                    //create outputfile
                    fileOutpFile = new File(fileOutpName);

                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("the clone file couldn't be declared");
            }

            //reads the input file as a stream of bytes and writes what it reads to the clone
            try {

                FileInputStream is = new FileInputStream(fileInpFile);
                FileOutputStream os = new FileOutputStream(fileOutpFile);
                for (int i = 0; i < fileInpFile.length(); i++) {
                    os.write(is.read());
                }
                is.close();
                os.close();

                System.out.println("Done!"); //debug

            } catch (Exception e) {
                System.err.println("There was an error in the cloning process.");
            }
        }

    }
}