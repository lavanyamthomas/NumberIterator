package com.afl.common;

import java.util.Scanner;

public class NumberHelper {
		
	public static final int THREE = 3;
	public static final int FIVE = 5;	
	
	
	// Read the input aruments
		public static int getNumberFromUser() {
			System.out.println("Enter the input number");
	        Scanner input = new Scanner(System.in);
	        return input.nextInt();
		}

}
