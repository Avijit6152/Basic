package org.basicprogram;

import java.util.Scanner;

public class FindTheSecondBiggestNumberAmongThreeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=s.nextInt();
		System.out.print("Enter Second Number : ");
		int b=s.nextInt();
		System.out.print("Enter Third Number : ");
		int c=s.nextInt();
		
            if(a>b && a<c || a>c && a<b ) {
            	System.out.println(a+" is Second Biggest Number");
            }
            
            else if(b>a && b<c || b>c && b<a) {
            	System.out.println(b+" is Second Biggest Number");
            }
            
            else {
            	System.out.println(c+" is Second Biggest Number");
            }
            
	}

}
