package org.bluewest.exercise.array;

import java.util.Arrays;

public class AlphabethCounterV1 {
	
	private final static char FIRST = 0;
	private final static char LAST = 9;
	private final static char FIRST_CHAR = 48;

	public static void main(String[] args) {
		final AlphabethCounterV1 fun = new AlphabethCounterV1();
		fun.countInLetters(100);

	}

	public String[] countInLetters(int stop) {
		
		final String[] result = new String[stop];
		char[] number = new char[1];
		
		for(int i = 0, numIndex = 0; i < stop ; i++) {
			
			if(numIndex >= number.length) {
				number = Arrays.copyOf(number, numIndex+1);
			}
			
			if(number[numIndex] >= LAST) {
				number[numIndex] = FIRST;
				numIndex++;
				i--;
				continue;
			}
			
			
			number[numIndex]++;
			numIndex = 0;
			println(number);
		}		
		
		return result;
	}
	
	public void println(char[] chars) {
		
		for(int i = chars.length - 1; i >= 0; i-- ) {
			//chars[i] = (char) ( chars[i] + FIRST_CHAR);
			//chars[i] +=  FIRST_CHAR;
			//System.out.print((int) (chars[i]) + "|");
			System.out.print((char) (chars[i] + FIRST_CHAR));
			int code = chars[i] + FIRST_CHAR;
//			System.out.print("|" + (char) code);
//			chars[i] = (char) code;
//			System.out.print("|<<" + (char) chars[i]);
		}
		
		System.out.println();
	}

}
