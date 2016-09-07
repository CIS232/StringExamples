package edu.cis232;

public class ToCharArray {

	public static void main(String[] args) {
		String str = "Some example text 22";
		
		//The original way to loop through the characters in a String
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(Character.isLetter(c)){
				System.out.print(c);
			}
		}
		System.out.println();
		
		//The enhanced way to loop through the characters in a String
		for(char c : str.toCharArray()){
			if(Character.isLetter(c)){
				System.out.print(c);
			}
		}
		System.out.println();
	}

}
