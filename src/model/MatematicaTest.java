package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatematicaTest {

	@Test
	public void testFibonacci() {
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		Matematica m = new Matematica();
		assertEquals(1, m.fibonacci(1));
		assertEquals(1, m.fibonacci(2));
		assertEquals(2, m.fibonacci(3));
		assertEquals(3, m.fibonacci(4));
		assertEquals(13, m.fibonacci(7));
		assertEquals(21, m.fibonacci(8));
		assertEquals(34, m.fibonacci(9));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFibonacciException() {
		Matematica m = new Matematica();
		assertEquals(0, m.fibonacci(0));
	}
}
