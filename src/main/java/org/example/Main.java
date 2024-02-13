package org.example;

@SuppressWarnings("javadoc")
public class Main {

    private static String myMessage = "Hello World!";
    private static int apples= 10;
    private static int oranges= 20;

    public static int add(int apples, int oranges) {
        return apples + oranges;
    }

    public static void main(String[] args) {

        System.out.println(String.format("%s, number %d", myMessage, add(apples, oranges)));


    }
}
