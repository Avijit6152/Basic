package org.basicprogram;

import java.util.Scanner;

public class AddEvenNumberBetweenRange {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=s.nextInt();	System.out.print("Enter Last Number : ");
		int b=s.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++) {
			
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.print(" Sum of even Numbers = "+sum);
		s.close();
	}

}
