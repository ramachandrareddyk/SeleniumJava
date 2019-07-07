package com.Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {

	public static void main(String args[]) throws Exception {
		List <String> names = new ArrayList <String>();  
		  names.add("Ravi");  
		  names.add("Vijay");  
		  names.add("Ravi");  
		  names.add("Ajay");  
		  
		  Iterator itr = names.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  System.out.println(names.size());
		  names.remove(1);
		  System.out.println(names.size());
		  for(int i = 0; i < names.size(); i++) {
			  System.out.println(names.get(i));
		  }
		  
		  	}
}
