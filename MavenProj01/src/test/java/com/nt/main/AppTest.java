package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  @Test
  public void testWithPositiveVal() {
	  App ap=new App();
	  int expected=30;
	  int actual=ap.arthmeaticCal(10,20);
	  assertEquals(expected,actual);
  }
  
  @Test
  public void testWithNegativeVal() {
	  App ap=new App();
	  int expected=30;
	  int actual=ap.arthmeaticCal(10,20);
	  assertEquals(expected,actual);
  }
}
