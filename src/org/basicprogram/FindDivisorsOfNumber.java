package org.basicprogram;

import java.util.Scanner;

public class FindDivisorsOfNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=s.nextInt();
		
		for(int i=1;i<=a;i++) {
			
			if(a%i==0) {
				System.out.print(i+" ");
			}
		}

		s.close();
	}

}
