package com.resteasy.udemy.tdd;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class CalculatorTest {
	@Test
	public void testNewCalculatorHasAnAccumulatorOfZero() {
		Calculator calculator = new Calculator();
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
	}
}
