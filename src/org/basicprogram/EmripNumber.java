package org.basicprogram;

import java.util.Scanner;

public class EmripNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number=s.nextInt();

	        if (isEmirp(number)) {
	            System.out.println(number + " is an Emirp number.");
	        } else {
	            System.out.println(number + " is not an Emirp number.");
	        }
	    }

	    // Function to check if a number is prime
	    private static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Function to check if a number is an Emirp number
	    private static boolean isEmirp(int num) {
	        // Check if the number is prime
	        if (!isPrime(num)) {
	            return false;
	        }

	        // Reverse the digits of the number
	        int reversedNum = 0;
	        int temp = num;
	        while (temp != 0) {
	            reversedNum = reversedNum * 10 + temp % 10;
	            temp /= 10;
	        }

	        // Check if the reversed number is also prime
	        return isPrime(reversedNum);
	    }



	}



