package com.TestNG;

import org.testng.annotations.Test;

public class GroupingTests {
  
  @Test(groups={"Smoke"})
  public void A() {
	  System.out.println("Method A");
  }
  
  @Test(groups={"Regression"})
  public void B() {
	  System.out.println("Method B");
  }
  
  
  @Test(groups={"Smoke", "Regression"})
  public void C() {
	  System.out.println("Method C");
  }
  
  
  @Test
  public void D() {
	  System.out.println("Method D");
  }
}
