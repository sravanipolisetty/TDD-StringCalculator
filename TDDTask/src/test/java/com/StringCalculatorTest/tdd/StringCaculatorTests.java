package com.StringCalculatorTest.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCaculatorTests {

	/* input : "1,2,3" 
	 * Expected Output:RunTimeException
	 * Task1: The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2” */
	@Test(expected=RuntimeException.class)
	public void sumOfThreeNumbers() {
		//assertEquals(RuntimeException.class, StringCalculator.add("1,2,3"));
		StringCalculator.add("1,2,3");
		assertTrue(true);
	}	
	
	
	/* input : "1,2" 
	 * Expected Output:RunTimeException*/
	@Test
	public void sumOfTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}

	/* input : "1,S" 
	 * Expected Output:Exception*/
	@Test(expected=RuntimeException.class)
	public void sumOfNumberAndLiteral() {
		StringCalculator.add("1,S");
		assertTrue(true);
	}
	/* input : "3" 
	 * Expected Output:Exception*/
	@Test
	public void sumOfSingleNumber() {
		assertEquals(3, StringCalculator.add("3"));
	}
	
	/* Start with the simplest test case of an empty string and move to 1 and two numbers*/
	@Test
	public void EmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	//Allow the Add method to handle an unknown amount of numbers
	/*Input : 5,7,6,2,7,6,2
	 * ExpectedOutput:35 
	 */
	@Test
	public void HandlingUnknowAmoutOfNumbers() {
		assertEquals(35, StringCalculator.add("5,7,6,2,7,6,2"));
	}
	
	/* input : "1,2,3,5,6,7,Y,8,9" 
	 * Expected Output:RunTimeException*/
	@Test(expected=RuntimeException.class)
	public void HandlingUnknownAmountOfNumbersWithIllegalLiteral() {
		assertEquals(RuntimeException.class, StringCalculator.add("1,2,3,5,6,7,Y,8,9"));
		
	}
	
	/* input : "1\n2,3"
	 * Expected Output:6*/
	@Test
	public void HandlingLineBreaks() {
		assertEquals(6, StringCalculator.add("1\n2,3"));		
	}
	
	/* input : "1\n,2,3"
	 * Expected Output:6*/
	@Test
	public void HandlingLineBreaksAndCommas() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
		
	}
	
	/* Inputs with delimiters
	 * input ://1\n,2//5
	 * ExpectedOutput :8
	 * */
	@Test
	public void handlineDelimiters(){
		assertEquals(8,StringCalculator.add("//1\n,2//5"));
	}
	
	/* Inputs with delimiters
	 * input :3,-6,15,18,46,33
	 * ExpectedOutput :Exception
	 * */
	@Test(expected = RuntimeException.class)
	public final void whenNegativeNumberIsUsed() {
	    StringCalculator.add("3,-6,-15,18,46,33");
	    assertTrue(true);
	}
	
	/* input :3,1000,2
	 * ExpectedOutput :5
	 * */
	@Test
	public final void numbersBiggerThanThousand() {
	    assertEquals(5,StringCalculator.add("3,1000,2"));
	    
	}
	
	@Test
	public final void handlingmultipleDelimiters() {
	    assertEquals(6,StringCalculator.add("3,%1,2"));
	    
	}
	
}
