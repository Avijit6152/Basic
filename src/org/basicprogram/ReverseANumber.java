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



