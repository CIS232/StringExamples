package edu.cis232;

import java.util.Scanner;

public class LabIndexOf {
	/**
	 * Write a program that asks for input from the user.
		Print out the position of the first occurrence of the 'C' Character.  (+3 points)
		Print out the position of every occurrence of the 'C' Character. (+2 points)
	 */
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me some input");
		String input = keyboard.nextLine();
		
		//+3 points, show first C
		int cIndex = input.indexOf('C');
		if(cIndex >= 0){
			System.out.println("C first appears at index " + cIndex);
		} else {
			System.out.println("C does not appear in the input");
		}
		
		//+2 points, show every C
		int cIndex2 = input.indexOf('C');
		while(cIndex2 >= 0){
			System.out.println("C at index " + cIndex2);
			cIndex2 = input.indexOf('C', cIndex2 + 1);
		}
		
		//Case-insensitive search
		int cIndex3 = input.toUpperCase().indexOf('C');
		if(cIndex3 >= 0){
			System.out.println("C or c appears at index " + cIndex3);
		}
	}
}
