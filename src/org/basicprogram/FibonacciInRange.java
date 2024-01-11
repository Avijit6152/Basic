package org.basicprogram;

import java.util.Scanner;

public class FibonacciInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Fibonacci numbers in the range [" + lowerBound + ", " + upperBound + "]:");
        printFibonacciInRange(lowerBound, upperBound);

        scanner.close();
    }

    // Function to print Fibonacci numbers within a given range
    private static void printFibonacciInRange(int lowerBound, int upperBound) {
        int a = 0, b = 1, c = 0;

        while (c <= upperBound) {
            if (c >= lowerBound) {
                System.out.print(c + " ");
            }
            a = b;
            b = c;
            c = a + b;
        }
    }
}
