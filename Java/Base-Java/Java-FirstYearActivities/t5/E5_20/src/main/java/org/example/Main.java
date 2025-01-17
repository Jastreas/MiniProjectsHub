package org.example;

public class Main {
    public static void main(String[] args) {
        String mail = "testmail@gmail.com";
        Email g = new Email(mail);
        System.out.println(g.getEmail());
        System.out.println("-------------");
        boolean r = g.esCorrecto();
        System.out.println(r);
    }
}