package org.basicprogram;

import java.util.Scanner;

public class ReverseNumberUsingForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=s.nextInt();
		int rev=0;
		
		for(int i=a;i!=0;i/=10) {
			int rem=i%10;
			rev=(rev*10)+rem;
		}

		s.close();
		System.out.println("Reverse  Number Of "+a+" is "+rev);
	}

}
