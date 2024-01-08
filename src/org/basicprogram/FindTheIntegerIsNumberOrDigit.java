package org.basicprogram;

import java.util.Scanner;

public class FindTheIntegerIsNumberOrDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Integer Number : ");
		int a=s.nextInt();
		if(a<10 && a>-10) {
			System.out.println(a+" is a Digit");
		}
		else {
			System.out.println(a+" is a Number");
		}
		
		//OR IN A SINGLE LINE 
		
		System.out.println(a<10? a+" is a Digit": a+" is a Number");
	}
}
