package org.basicprogram;

public class HarshadNumber {
    public static void main(String[] args) {
        int number = 18; // Replace this with the number you want to check

        if (isHarshad(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }

    // Function to check if a number is a Harshad number
    private static boolean isHarshad(int num) {
        // Check if the number is not zero
        if (num == 0) {
            return false;
        }

        // Calculate the sum of digits
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        return num % sum == 0;
    }
}
