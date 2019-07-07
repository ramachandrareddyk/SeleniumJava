package com.Java;

import java.util.HashMap;

public class HashMaps {

	public static void main(String args[]) {  
		HashMap <Integer, String> map = new HashMap <Integer, String>();           
		map.put(101,"Let us C");  
		map.put(102, "Operating System");  
		map.put(103, "Data Communication and Networking");  
		System.out.println("Values before remove: "+ map);    
		System.out.println(map.keySet());
		System.out.println(map.values());
		// Remove value for key 102  
		map.remove(102);  
		System.out.println("Values after remove: "+ map);  
		System.out.println(map.get(103));
	}  
	
}
