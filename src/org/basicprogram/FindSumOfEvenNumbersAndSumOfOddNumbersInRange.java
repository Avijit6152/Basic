package org.basicprogram;

import java.util.Scanner;

public class FindSumOfEvenNumbersAndSumOfOddNumbersInRange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=s.nextInt();	System.out.print("Enter Last Number : ");
		int b=s.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=a;i<=b;i++) {
			
			if(i%2==0) {
				sum1=sum1+i;
			}
			else {
				sum2=sum2+i;
			}
		}
		System.out.print(" Sum of Even Numbers = "+sum1);
		System.out.println(" Sum of Odd Numbers = "+sum2);
		s.close();

	}

}
