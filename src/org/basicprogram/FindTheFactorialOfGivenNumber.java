package org.basicprogram;

import java.util.Scanner;

public class FindTheFactorialOfGivenNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=s.nextInt();
		int factorial=1;
		for(int i=1;i<=a;i++) {
			factorial=factorial*i;
		}

		s.close();
		System.out.println("Factorial Of Given Number = "+factorial);
	}

}
