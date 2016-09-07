package edu.cis232;

public class ExtractingSubstrings {

	public static void main(String[] args) {
		String fullName = "Daniel Joseph Rusk";
		
		//Get the last 4 characters
		String lastName = fullName.substring(14);
		
		//fullName is unmodified
		System.out.println(fullName);
		
		//lastName contains the characters starting at index 14 onward
		System.out.println("Last name: " + lastName);
		
		//Get the middlename
		String middleName = fullName.substring(7,13);
		System.out.println("Middle name: " + middleName);
		
		//Hardcoded indexes are very fragile, so lets find the indexes
		String fullName2 = "Bob Middleton Lastly";
		
		int lastSpaceIndex = fullName2.lastIndexOf(' ');
		lastName = fullName2.substring(lastSpaceIndex + 1);
		
		//We can use trim() to remove trailing and preceding whitespace, just in case
		lastName = lastName.trim();
		
		//Get the middle name by finding the first space and 
		//then extracting the characters between the spaces
		int firstSpaceIndex = fullName2.indexOf(' ');
		middleName = fullName2.substring(firstSpaceIndex + 1, lastSpaceIndex);
		
		System.out.println("Last name 2: " + lastName);
		
		//Get the middlename
		System.out.println("Middle name 2: " + middleName);
		
	}

}
