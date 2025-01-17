package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String formula = "(1+4-(2*3))";
        Stack<Character> pila = new Stack<Character>();
        boolean correcto = true;

        for (int i=0; i<formula.length() && correcto == true; i++){
            if (formula.charAt(i) == '('){
                pila.push(formula.charAt(i));
            } else if (formula.charAt(i) == ')'){
                if (pila.empty()){
                    correcto = false;
                } else {
                    pila.pop();
                }
            }
        }
        if(correcto && pila.empty()){
            System.out.println("La expresión es correcta, diría que hasta increíble, buen trabajo #BOB" + formula);
        } else {
            System.out.println("Cadete, es usted un inutil");
        }


    }
}