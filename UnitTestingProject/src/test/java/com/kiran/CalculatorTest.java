package com.kiran;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {
	
	@Autowired
	Calculator calc;
	
	@Test
	public void testAddSuccess() {
		int res = calc.add(10, 10);
		assertEquals(20, res);
		
	}
	@Test
	public void testAddFail() {
		int res = calc.add(10, 10);
		assertNotEquals(25, res);
		
	}
	@Test
	public void testSubSuccess() {
		int res = calc.sub(10, 10);
		assertEquals(0, res);
		
	}
	@Test
	public void testDivideSuccess() {
		double res = calc.divide(10, 10);
		assertEquals(1, res);
		
	}
//	double res() {
//		double res = calc.divide(10, 0);
//		return res;
//	}
//	@Test
//	public void testDivideThrowsArithmeticExxception() {
//	
//		assertThrows(ArithmeticException.class, ()-> res());
//	}
	
	@Test
	public void testDivideThrowsArithmeticExxception() {
	
		assertThrows(IllegalArgumentException.class, ()-> calc.divide(10,0));
	}
	
	
	

}
