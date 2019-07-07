package com.JUnit;

import java.util.Date;

import org.junit.Test;

public class DisplayTime {

	
	@Test
	public void time() {
		Date date = new Date();
		System.out.println("Today's date and time:"+ date);
	}
}
