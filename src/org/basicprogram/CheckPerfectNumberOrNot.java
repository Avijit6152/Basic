package org.basicprogram;

import java.util.Scanner;

public class CheckPerfectNumberOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter  Number : ");
		int a=s.nextInt();
		int sum=0;
			for(int i=1;i<a;i++) {
				
				if(a%i==0) {
					sum=sum+i;
					System.out.println(i+" ");
				}
				
				
			}
			
			if(a==sum) {
				System.out.println(" It is a Perfect Number");
			}

			else
			{
				System.out.println(" It is not a Perfect Number");
			}
			
		}

	}


