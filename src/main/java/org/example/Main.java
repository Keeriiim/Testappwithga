package org.example;

/**
 * This class represents a simple program that prints a message and adds two numbers.
 */
public class Main {

    /** The message to be printed */
    private static String myMessage = "Hello World!";

    /** The number of apples */
    private static int APPLES = 10;

    /** The number of oranges */
    private static int ORANGES = 20;

    /**
     * Adds two numbers and returns the result.
     *
     * @param a The first number (apples)
     * @param b The second number (oranges)
     * @return The sum of the two numbers
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * The main method of the program.
     *
     * @param args The command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Print the message along with the sum of apples and oranges
        System.out.println(String.format("%s, number %d", myMessage, add(APPLES, ORANGES)));
    }
}

