package com.Java;

import java.io.FileReader;
import java.util.Properties;

public class ReadFromPropertiesFile {

	public static void main(String[] args) throws Exception {  
	    FileReader reader = new FileReader("file.properties");
	    Properties p = new Properties();  
	    p.load(reader);  
	    p.put("test", "testing");
	    System.out.println(p.getProperty("username"));  
	    System.out.println(p.getProperty("password"));  
	    System.out.println(p.getProperty("test")); 
	}  
}
