package com.Java.WorkOutExamples;

import java.util.HashMap;

public class DeleteDuplicateNumbers {

	public static void main(String args[]) throws Exception {
		
		String text = "Java is easy to learn Java is a language";
		String finalText = "";
		String[] textArray = text.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int value = 1;
		for(int i = 0; i < textArray.length; i++) {
			String key = textArray[i];
			if(!(map.containsKey(key))) {
				map.put(key, value);
				finalText = finalText + " " + key;
			}
		}
		System.out.println(finalText);
		
	}
}
