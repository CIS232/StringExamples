package edu.cis232;

import java.util.Scanner;

public class SearchingStrings {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a county in Maryland:");
		
		String userInput = keyboard.nextLine();
		
		//Use startsWith to find if the input starts with Carroll
		if(userInput.startsWith("Carroll")){
			System.out.println("That's where we are now!");
		} else {
			System.out.println("That's not where we are now.");
		}
		
		//Use indexOf to find the word County
		int countyIndex = userInput.lastIndexOf("County");
		if(countyIndex >= 0){
			System.out.printf("The word 'County' appears at the %d index.%n", countyIndex);
		} else {
			System.out.println("The word 'County' did not appear in the input.");
		}
	}
}
