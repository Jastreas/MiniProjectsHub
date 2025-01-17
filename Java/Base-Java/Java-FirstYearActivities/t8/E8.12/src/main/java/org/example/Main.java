package org.example;

import java.util.ListIterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String fromula = "{(A+[C*D]-(5-{F})})";
        Stack <Character> pila = new Stack<Character>();
        boolean correcto = true;

        for (int i=0; i<fromula.length() && correcto == true; i++){
            if (fromula.charAt(i) == '{' || fromula.charAt(i) == '(' || fromula.charAt(i) == '['){
                pila.push(fromula.charAt(i));
            } else if(fromula.charAt(i) == '}' || fromula.charAt(i) == ')' || fromula.charAt(i) == ']'){
                if(pila.empty()){
                    correcto = false;
                } else {
                    if(fromula.charAt(i) == '}'){
                        int indexaeliminar=0;
                        for(int j=0; j<pila.size(); j++){
                            if(pila.get(j).equals('{')){
                                indexaeliminar = j;
                                break;
                            }
                        }
                        if(indexaeliminar != -1){
                            pila.remove(indexaeliminar);
                        }
                    } else if (fromula.charAt(i) == ']') {

                        int indexaeliminar=0;
                        for(int j=0; j<pila.size(); j++){
                            if(pila.get(j).equals('[')){
                                indexaeliminar = j;
                                break;
                            }
                        }
                        if(indexaeliminar != -1){
                            pila.remove(indexaeliminar);
                        }
                    } else if (fromula.charAt(i) == ')') {

                        int indexaeliminar=0;
                        for(int j=0; j<pila.size(); j++){
                            if(pila.get(j).equals('(')){
                                indexaeliminar = j;
                                break;
                            }
                        }
                        if(indexaeliminar != -1){
                            pila.remove(indexaeliminar);
                        }
                    }
                }
            }
            
        }

        if(pila.empty()){
            System.out.println("Es correcto" + fromula);
        } else {
            System.out.println("Es incorrecto" + fromula);
        }


        
    }
}