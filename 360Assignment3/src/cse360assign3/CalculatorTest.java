package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator dum = new Calculator();
	
	@Test
	public void testCalculator() {
		assertNotNull(dum);
	}	
	
	@Test
	public void testGetTotal() {
		assertEquals(dum.getTotal(), 0);
	}	
	
	@Test
	public void testAdd() {
		dum.add(3);
		assertEquals(dum.getTotal(), 3);
	}	
	
	@Test
	public void testSubtract() {
		dum.subtract(3);
		assertEquals(dum.getTotal(), -3);
	}	
	
	@Test
	public void testMultiply() {
		dum.multiply(3);
		assertEquals(dum.getTotal(), 0);
	}
	
	@Test
	public void testMultiply2() {
		dum.add(1);
		dum.multiply(3);
		assertEquals(dum.getTotal(), 3);
	}	
	
	@Test
	public void testDivide() {
		dum.divide(3);
		assertEquals(dum.getTotal(), 0);
	}
	
	@Test
	public void testDivide2() {
		dum.add(3);
		dum.divide(3);
		assertEquals(dum.getTotal(), 1);
	}
	
	@Test
	public void testDivide3() {
		dum.add(3);
		dum.divide(0);
		assertEquals(dum.getTotal(), 0);
	}
	
	@Test
	public void testGetHistory() {
		dum.add (4);
		dum.subtract (2);
		dum.multiply (2);
		dum.add(5);
		assertEquals(dum.getHistory(), "0 + 4 - 2 * 2 + 5");
	}

}
