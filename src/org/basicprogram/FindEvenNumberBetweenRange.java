package org.basicprogram;

import java.util.Scanner;

public class FindEvenNumberBetweenRange {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=s.nextInt();
		System.out.print("Enter Last Number : ");
		int b=s.nextInt();
		
		for(int i=a;i<=b;i++) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		s.close();

	}

}
