package org.basicprogram;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=s.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum=sum+i;
		}

		s.close();
		System.out.println("Sum of Natural Numbers = "+sum);
	}

}
