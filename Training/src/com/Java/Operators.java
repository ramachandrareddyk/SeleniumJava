package com.Java;

import org.testng.annotations.Test;

public class Operators {
	@Test
	public void operate() throws Exception {
		int a = 10, b = 20;
		boolean flag1 = true;
		boolean flag2 = false;
		
		//Unary operator ++ -- !
		System.out.println("BB" + ++a); //11
		System.out.println("BB" + a);//11
		System.out.println("BB" + a++);//11
		System.out.println("BB" + a);//12
		System.out.println("A" + a++); //12
		System.out.println(b--); //20
		System.out.println(b); //19
		System.out.println(!flag1); //false
		
		//Arithmetic operators
		/*System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(b * a);
		System.out.println(b/a);  //2 
		System.out.println(b%a);  //0
		*/
		
		//Logical operators && ||
		/*System.out.println(flag1 && flag2); //false
		System.out.println(flag1 || flag2); //True
*/
		//Ternary operator
		int x = (12 < 5) ? 10 : 20;  
		System.out.println(x);
		
		//Assignment operator =
		/*int p = 100;
		int q = p;
		int r = q;
		System.out.println(r); //100
		
		int a1 = 10;
		int b1 = 20;
		System.out.println(a1==b1); //false
		
		*/
	}
}
