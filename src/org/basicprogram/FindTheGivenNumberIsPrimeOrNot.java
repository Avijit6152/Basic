package org.basicprogram;

import java.util.Scanner;

public class FindTheGivenNumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=s.nextInt();
		int count=0;
		
		for(int i=1;i<=a;i++) {
			
			if(a%i==0){
				
				count++;
				
			}
		}
		
		if(count==2) {
			System.out.println(" It is a Prime Number ");
		}
		
		else {
			
			System.out.println(" It is not a Prime Number ");
			
		}
		
		s.close();

	}

}
