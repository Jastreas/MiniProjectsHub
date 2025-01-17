/*
- Un constructor por defecto.
- Un constructor que reciba como parámetro el DNI y calcule y asigne la letra que le corresponde.
- Un método leer(): que pida por teclado el número de DNI y calcule a partir del DNI introducido la 
- letra que le corresponde y se los asigne al objeto.
- Método toString() que devuelve un String con el NIF de la siguiente forma: ocho dígitos, 
- un guión y la letra en mayúscula. Por ejemplo: 12345678-Z
- Método para obtener la letra del NIF:
*/
import java.util.Scanner;

public class Nif {
    int DNI;
    String Letra;

    public Nif(){
        this.DNI = 1;
        this.Letra = "A";
    }

    public Nif(int dni){
        this.DNI = dni;
        this.Letra = calculoLetra(dni);
    }

    public void Leer(int dni){
        System.out.println("Introduzca el DNI: ");
        Scanner sc = new Scanner(System.in);
        dni = sc.nextInt();
        this.Letra = calculoLetra(dni);
        System.out.println("Ha introducido: " + this.DNI);
        sc.close();
    }

    public void aString(){
        System.out.println(this.DNI + "-" + this.Letra);
    }


    private String calculoLetra(int DNI){
        int caso = DNI%23;

        switch (caso) {
            case 0: this.Letra = "T";
                    return this.Letra;
                    //no se pone break pq nunca se llega a el
            case 1: this.Letra = "R";
                    return this.Letra;
                
            case 2: this.Letra = "W";
                    return this.Letra;
                
            case 3: this.Letra = "A";
                    return this.Letra;
                
            case 4: this.Letra = "G";
                    return this.Letra;
                
            case 5: this.Letra = "M";
                    return this.Letra;
                
            case 6: this.Letra = "Y";
                    return this.Letra;
                
            case 7: this.Letra = "F";
                    return this.Letra;
                
            case 8: this.Letra = "P";
                    return this.Letra;
                
            case 9: this.Letra = "D";
                    return this.Letra;
                
            case 10: this.Letra = "X";
                    return this.Letra;
                
            case 11: this.Letra = "B";
                    return this.Letra;
                
            case 12: this.Letra = "N";
                    return this.Letra;
                
            case 13: this.Letra = "J";
                    return this.Letra;
                
            case 14: this.Letra = "Z";
                    return this.Letra;
                
            case 15: this.Letra = "S";
                    return this.Letra;
                
            case 16: this.Letra = "Q";
                    return this.Letra;
                
            case 17: this.Letra = "V";
                    return this.Letra;
                
            case 18: this.Letra = "H";
                    return this.Letra;
                
            case 19: this.Letra = "L";
                    return this.Letra;
                
            case 20: this.Letra = "C";
                    return this.Letra;
                
            case 21: this.Letra = "K";
                    return this.Letra;
                
            case 22: this.Letra = "E";
                    return this.Letra;
                
        
            default:
                this.Letra = "Null";
                return this.Letra;
                
            
        }
        
    }
    

}
