package org.basicprogram;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int number = 19; // Replace this with the number you want to check

        if (isHappyNumber(number)) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }
    }

    // Function to check if a number is a Happy Number
    private static boolean isHappyNumber(int num) {
        // Use a HashSet to detect cycles
        HashSet<Integer> seenNumbers = new HashSet<>();

        while (num != 1 && !seenNumbers.contains(num)) {
            seenNumbers.add(num);
            num = getNextNumber(num);
        }

        // If the loop exited because num == 1, it's a Happy Number
        return num == 1;
    }

    // Function to calculate the sum of squares of digits
    private static int getNextNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}

