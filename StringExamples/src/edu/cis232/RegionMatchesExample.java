package edu.cis232;

public class RegionMatchesExample {

	public static void main(String[] args) {
		String str = "Four score and seven years ago";
		String str2 = "Those seven YEARS passed quickly";
		
		if(str.regionMatches(15, str2, 6, 11)){
			System.out.println("The regions match.");
		} else {
			System.out.println("The regions do not match.");
		}

	}

}
