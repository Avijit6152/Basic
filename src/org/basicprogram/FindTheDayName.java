package org.basicprogram;

import java.util.Scanner;

public class FindTheDayName {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number (1-7) : ");
		int a=s.nextInt();
		
		switch (a) {
		case 1: System.out.println("SUNDAY");
		break;
		case 2: System.out.println("MONDAY");
		break;
		case 3: System.out.println("TUESDAY");
		break;
		case 4: System.out.println("WEDNESDAY");
		break;
		case 5: System.out.println("THURSDAY");
		break;
		case 6: System.out.println("FRIDAY");
		break;
		case 7: System.out.println("SATURDAY");
		break;
		default:System.out.println("!!!!INVALID INPUT!!!!");
		break;	
		}

	}

}
