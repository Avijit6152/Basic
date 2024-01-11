package org.basicprogram;

import java.util.Scanner;

public class FindSumOfDigitsPresentInANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a=s.nextInt();
		int sum=0;
		for(int i=a;i!=0;i/=10) {
			sum=sum+(i%10);
		}
		
		s.close();
		System.out.println("Sum of digits Present in number : "+sum);
	}
}
