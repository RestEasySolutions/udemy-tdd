package com.resteasy.udemy.tdd;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ant Brown on 05/04/2016.
 */
public class OperationsTest {

	private Calculator calculator;

	@Before
	public void createCalculatorWithTwoValues() {
		calculator = new Calculator();
		calculator.setAccumulator(new BigDecimal(20));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
	}

	@Test
	public void testAdd() {
		calculator.add();
		assertEquals(new BigDecimal(24), calculator.getAccumulator());
	}

	@Test
	public void testSubtract() {
		calculator.subtract();
		assertEquals(new BigDecimal(16), calculator.getAccumulator());
	}
}
