package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator dum = new Calculator();
	
	@Test
	public void testCalculator() {
		assertNotNull(dum);					//Asserts object is not null
	}	
	
	@Test
	public void testGetTotal() {
		assertEquals(dum.getTotal(), 0);	//Asserts object total initialized to 0
	}	
	
	@Test
	public void testAdd() {
		dum.add(3);
		assertEquals(dum.getTotal(), 3);	//Asserts value takes addition command
	}	
	
	@Test
	public void testSubtract() {
		dum.subtract(3);
		assertEquals(dum.getTotal(), -3);	//Asserts value takes subtraction command
	}	
	
	@Test
	public void testMultiply() {			//Asserts value takes multiply command
		dum.multiply(3);
		assertEquals(dum.getTotal(), 0);
	}
	
	@Test
	public void testMultiply2() {
		dum.add(1);
		dum.multiply(3);
		assertEquals(dum.getTotal(), 3);	//Asserts value takes alternate multiply command
	}	
	
	@Test
	public void testDivide() {
		dum.divide(3);
		assertEquals(dum.getTotal(), 0);	//Asserts value takes divide command
	}
	
	@Test
	public void testDivide2() {
		dum.add(3);
		dum.divide(3);
		assertEquals(dum.getTotal(), 1);	//Asserts value takes alternate divide command
	}
	
	@Test
	public void testDivide3() {
		dum.add(3);
		dum.divide(0);
		assertEquals(dum.getTotal(), 0);	//Asserts value account for division by 0 "properly"
	}
	
	@Test
	public void testGetHistory() {
		dum.add(4);
		dum.subtract(2);
		dum.multiply(2);
		dum.add(5);
		assertEquals(dum.getHistory(), "0 + 4 - 2 * 2 + 5");	//Asserts history string keeps proper track of operations performed
	}
	
	@Test
	public void testGetHistory2() {
		dum.add(4);
		dum.subtract(2);
		dum.multiply(2);
		dum.add(5);
		dum.divide(0);
		assertEquals(dum.getHistory(), "0 + 4 - 2 * 2 + 5 / 0");	//Asserts history string keeps proper track of alternate operations performed
	}
	
	@Test
	public void testDoesItWork() {
		dum.add(4);
		dum.subtract(2);
		dum.multiply(2);
		dum.add(5);
		assertEquals(dum.getTotal(), 9);	//Asserts calculations are correct
	}
}
