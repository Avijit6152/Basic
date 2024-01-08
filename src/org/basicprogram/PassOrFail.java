package org.basicprogram;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Math Marks : ");
		int a=s.nextInt();
		System.out.print("Enter Physics Marks : ");
		int b=s.nextInt();
		System.out.print("Enter Chemistry Marks : ");
		int c=s.nextInt();
		System.out.print("Enter Biology Marks : ");
		int d=s.nextInt();

		if(a>=35 && b>=35 && c>=35 && c>=35) {
			System.out.println("He/She is Passed The Exam");
		}
		else
		{
			System.out.println("He/She is Failed The Exam");
		}
	}

}
