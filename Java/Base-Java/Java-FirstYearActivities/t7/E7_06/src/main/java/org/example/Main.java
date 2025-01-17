package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        * 1. Va a mostrar el metodo sin problemas, por lo que muestra por pantalla "Valor al final del try 44"
        *
        * 2. Va a tener un error en el try del metodo, pero el catch funcionará correctamente por lo que
        * mostrará por pantalla: "Valor al final del catch: 42"
        *
        * 3. Tanto el try como el catch tendrán un error por incompatibilidad de tipos por lo que mostrará por pantalla
        * el finally: "Valor al final del finally: 1"
        *
        * 4. Envia una excepcion cargada con NULL por lo que la recibirá en el catch, siendo que con esto mostrará por
        * pantalla: "Valor al final del catch: 42"
        * */
    }
}