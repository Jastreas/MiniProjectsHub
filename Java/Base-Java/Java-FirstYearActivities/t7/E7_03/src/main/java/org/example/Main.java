package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("NOSE");
            System.out.println("ALGO");
            throw new Exception();
        }catch (Exception e){
            System.out.println("NOva");
        }
    }
}