package org.basicprogram;

import java.util.Scanner;

public class PrintNumberBetweenTwoNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=s.nextInt();
		System.out.print("Enter Last Number : ");
		int b=s.nextInt();

		if(a<=b) {
			for(int i=a;i<=b;i++) {
				System.out.print(i+" ");
			}
		}
		else {
			for(int j=a;j>=b;j--) {
				System.out.print(j+" ");
			}
		}
	}

}
