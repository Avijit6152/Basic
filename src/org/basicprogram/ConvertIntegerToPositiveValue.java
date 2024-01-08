package org.basicprogram;

import java.util.Scanner;

public class ConvertIntegerToPositiveValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Interger Value : ");
		int a=s.nextInt();
		if(a<0) {
			a=a*(-1);
		}
        System.out.println("The Positive Value of the Integer : "+a);
	}

}
