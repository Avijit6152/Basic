package org.basicprogram;

import java.util.Scanner;

public class LargestDigitInANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int largestDigit = findLargestDigit(number);

        System.out.println("The largest digit in the number is: " + largestDigit);

        scanner.close();
    }

    // Function to find the largest digit in a number
    private static int findLargestDigit(int num) {
        int largestDigit = 0;

        while (num > 0) {
            int digit = num % 10;
            largestDigit = Math.max(largestDigit, digit);
            num /= 10;
        }

        return largestDigit;
    }
}

