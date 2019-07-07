package com.Java.WorkOutExamples;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateWords {

	//Find duplicate words and their occurrences
	public static void findDuplicateWords(String input) {
		String[] words = input.split("-");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for(int i = 0; i < words.length; i++) {
			String key = words[i];
			int value = 1;
			if(!(wordCount.containsKey(key))) {
				for(int j = i+1; j < words.length; j++) {
					if(key.equals(words[j])) {
						value = value + 1;
					}
				}
				wordCount.put(key, value);
			}
		}
		System.out.println(Arrays.asList(wordCount));
	}
	
	public static void main(String args[]) throws Exception { 
		findDuplicateWords("Super-Man-Bat-Man-Spider-Man");
	}
}
