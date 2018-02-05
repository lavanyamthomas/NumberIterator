package com.afl.common;

public class NumberValidations {

	public NumberValidations() {
		// TODO Auto-generated constructor stub
	}
	
public int intputNumberValidations(int userInput){
		
		if (userInput < 0) {
			 System.out.println("Enter Number shoud be positive integer and more than 0 "+userInput);
	            return NumberHelper.getNumberFromUser();
	            
	        }
		return userInput;
		
	}

}
