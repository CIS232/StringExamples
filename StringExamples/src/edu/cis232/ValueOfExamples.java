package edu.cis232;

public class ValueOfExamples {
	public static void main(String[] args){
		//Static method 'valueOf' will converts primitive types to a String
		int tensPlace = 5;
		
		int onesPlace = 7;
		
		//combine them together to show 57
		String number = String.valueOf(tensPlace).concat(String.valueOf(onesPlace));
		System.out.println(number);
		
		
		float pi = 3.14159f;
		String piStr = String.valueOf(pi);
		System.out.println(piStr);
		//For more control, use String.format
		System.out.println(String.format("%.2f", pi));
	}
}
