package org.example;

public class Main {
    public static void main(String[] args) {

        try {
            double n = (int)(Math.random() * 999 + 1);
            System.out.println(n);

            if (n%2 == 0){
                throw new Exception("Es par");
            } else {
                throw new Exception("Es impar");
            }
        } catch (Exception e){
            System.out.println(e);
        }


    }
}