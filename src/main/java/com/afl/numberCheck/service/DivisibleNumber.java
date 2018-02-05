/**
 * 
 */
package com.afl.numberCheck.service;

import com.afl.common.NumberHelper;

/**
 * @author lavanya
 *
 */
public class DivisibleNumber implements NumberIterateRule {

	/**
	 * 
	 */
	public DivisibleNumber() {		
	}

	public String numberIterateRule(Integer number) {
		String startMsg = "The number " + number + " ";
		String divMsg = startMsg + " can be divided by ";
		String message = startMsg + "cannot be divided by 3 or 5.";
		
		Boolean DividedByThree = (number%NumberHelper.THREE ==0);
		Boolean DividedByFive = (number%NumberHelper.FIVE ==0);
		
		if(DividedByThree && DividedByFive) {
			return divMsg+ NumberHelper.THREE +" and " +NumberHelper.FIVE +"\n “BAZ”.";
		}else if(DividedByThree) {
			return divMsg+ NumberHelper.THREE +"\n “FOO”";
		}else if(DividedByFive) {
			return divMsg+ NumberHelper.FIVE +"\n “BAR”.";
		}else		
			return message;
	}

}
