package com.Java;

public class Strings {
	
	public static void main(String args[]) throws Exception {
		String text = "selenium is an automation toolasds      asdad          ";
		/*System.out.println(text.charAt(1)); //e
		System.out.println(text.indexOf('e')); //1
		System.out.println("Number Of characters in the string:" + text.length());
		System.out.println(text.substring(3));
		System.out.println(text.substring(0, 4));
		System.out.println(text.contains("selenium"));//false
		System.out.println(text.equals("selenium"));//false
		System.out.println(text.equalsIgnoreCase("SELENIUM")); //true
		System.out.println(text.concat("additional text"));
		System.out.println(text.replace("trainings", "testing"));*/
		String[] words = text.split(" ");
		System.out.println(words.length);
		System.out.println(words[0]);
		System.out.println(words[1]);
		/*System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println(text.trim());
		*/
	}

}
