package org.basicprogram;

import java.util.Scanner;

public class FindTheSpecialTwoDigitNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=s.nextInt();
		if((a>9 && a<100) || (a>-100 && a<-9));
		{
			int q=a/10;
			int r=a%10;
			int b=(q+r)+(q*r);
			
			if(a==b) {
				System.out.println(a+" is a Two Digit Special Number");
			}
			else {
				System.out.println(a+" is not a Two Digit Special Number ");
			}
		}
		
		// OR IN ALTERNATE WAYS

	}

}
