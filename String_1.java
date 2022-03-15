package com.company;

public class String_1 {

    public static void main(String[] args) {
        // write your code here
        String message1 = new String("Hello");
        String message2 = "My Name Ayush Aditya." + " I am Web Developer/Coder.  ";
        System.out.println(message1);
        System.out.println(message2);
        System.out.println("No. Of Characters Used = "+ message2.length());
        System.out.println(message2.toLowerCase());
        System.out.println(message2.isBlank());
        System.out.println(message2.strip());
        System.out.println(message2.endsWith(" I am Web Developer/Coder.  "));
        System.out.println(message2.indexOf("A"));
        System.out.println(message2.indexOf("sky"));
        System.out.println(message2.replace("I","i"));

    }
}
