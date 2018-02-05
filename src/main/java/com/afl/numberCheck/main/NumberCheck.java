/**
 * 
 */
package com.afl.numberCheck.main;

import java.util.Scanner;

import com.afl.common.NumberHelper;
import com.afl.numberCheck.service.DivisibleNumber;
import com.afl.numberCheck.service.NumberIterateRule;

/**
 * @author lavanya
 *
 */
public class NumberCheck {

	/**
	 * 
	 */
	public NumberCheck() {
		
	}

	/**15
	 * @param args
	 */
	public static void main(String[] args) {		
		
		NumberIterateRule rule = new DivisibleNumber(); 
		System.out.println(rule.numberIterateRule(NumberHelper.getNumberFromUser()));
		
	}
	
	

}
