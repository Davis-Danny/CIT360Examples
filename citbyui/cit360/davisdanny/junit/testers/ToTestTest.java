package citbyui.cit360.davisdanny.junit.testers;

import static org.junit.Assert.*;

import org.junit.Test;

import citbyui.cit360.davisdanny.junit.totest.ToTest;

public class ToTestTest {

	
	@Test
	public void basicMultiplicationShouldWork() {
		ToTest tester = new ToTest();
		
		assertEquals("2 x 2 must equal 4",4,tester.mult(2, 2));
		assertEquals("2 x 3 must equal 6",6,tester.mult(2, 3));
	}
	
	@Test
	public void aNegativeAndAPostiveShouldReturnANegative(){
		
		ToTest tester = new ToTest();
		
		assertEquals("-3 x 4 must equal -12",-12,tester.mult(-3, 4));
		assertEquals("5 x -2 must equal -10",-10,tester.mult(5, -2));
	}
	
	@Test
	  public void multiplicationOfZeroIntegersShouldReturnZero() {

	    ToTest tester = new ToTest();

	    assertEquals("10 x 0 must be 0", 0, tester.mult(10, 0));
	    assertEquals("0 x 10 must be 0", 0, tester.mult(0, 10));
	    assertEquals("0 x 0 must be 0", 0, tester.mult(0, 0));
	  }

}
