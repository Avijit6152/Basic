package org.basicprogram;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a=s.nextInt();
		int rev=0;
		while(a!=0) {
			 int digit = a % 10;
             rev = rev * 10 + digit;
             a /= 10;
			
		}

		s.close();
		System.out.println(rev);
	}

}



//import java.util.Scanner;
//
//public class ReverseNumber {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input the number
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        // Reverse the number
//        int reversedNumber = reverseNumber(number);
//
//        // Display the reversed number
//        System.out.println("Reversed number: " + reversedNumber);
//    }
//
//    // Function to reverse a number
//    private static int reverseNumber(int number) {
//        int reversedNumber = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//            number /= 10;
//        }
//
//        return reversedNumber;
//    }
//}
