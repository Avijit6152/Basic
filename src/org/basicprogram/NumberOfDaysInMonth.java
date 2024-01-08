package org.basicprogram;

import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the MonthNumner(1-12) : ");
        int a=s.nextInt();
        if(a>=1 && a<=12) {
        	if(a==4 || a==6 || a==9 || a==11) {
        		System.out.println(" 30days ");
        	}
        	else if(a==2) {
        		System.out.println(" 28days Or 29days ");
        	}
        	else {
        		System.out.println(" 31days ");
        	}
        	
        	
        }
        
        else {
        	System.out.println("Invalid Input");
        }
        
	}

}
