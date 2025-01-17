package org.example;

import java.util.Stack;

public class VerificadorVocales {
        Stack<Character> pile;
    public VerificadorVocales(Stack<Character> pila){
        pile = pila;
    }

    //metodo

    public int verificar(String cadena, char vocal){
        int cont=0;
        for (int i=0; i<cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if(caracter == vocal){
                cont++;
                if(pile.empty()){
                    pile.push(caracter);
                } else if(pile.contains(caracter)){
                    pile.pop();
                }
            }
        }

        if (cont==0) {return 0;}
        else{
            if (pile.empty()){
                return 1;
            } else {
                return -1;
            }
        }

    }



    
}
