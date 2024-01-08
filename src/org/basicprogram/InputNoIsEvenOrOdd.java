package org.basicprogram;

import java.util.Scanner;

public class InputNoIsEvenOrOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int a=s.nextInt();
		
		if(a%2==0) {
			System.out.println(a+" Number is Even");
		}
		else {
			System.out.println(a+" Number is Odd");
		}
		
		//OR In a Single Line
		
		System.out.println(a%2==0?" IT IS A EVEN NUMBER":" IT IS A ODD NUMBER");
	}

}
