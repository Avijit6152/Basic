package org.basicprogram;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isNeonNumber(number)) {
            System.out.println(number + " is a Neon number.");
        } else {
            System.out.println(number + " is not a Neon number.");
        }

        scanner.close();
    }

    // Function to check if a number is a Neon number
    private static boolean isNeonNumber(int num) {
        int square = num * num;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == num;
    }
}
