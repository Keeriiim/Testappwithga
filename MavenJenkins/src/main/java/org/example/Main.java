package org.example;


public class Main {

    private static String myMessage = "Hello World!";
    private static int number1= 10;
    private static int number2= 20;

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {

        System.out.println(String.format("%s, number %d", myMessage, add(number1, number2)));


    }
}
