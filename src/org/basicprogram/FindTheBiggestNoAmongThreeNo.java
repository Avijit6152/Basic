package org.basicprogram;

import java.util.Scanner;

public class FindTheBiggestNoAmongThreeNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter FirstNumber : ");
		int a=s.nextInt();
		System.out.print("Enter SecondNumber : ");
		int b=s.nextInt();
		System.out.print("Enter ThirdNumber : ");
		int c=s.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is biggest number");
		}
		else if( b>c) {
			System.out.println(b+" is biggest number");
		}
		else {
			System.out.println(c+"is biggest number");
		}
	}

}
