package com.resteasy.udemy.tdd;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class CalculatorTest {
	Calculator calculator;

	@Before
	public void createCalculator() {
		calculator = new Calculator();
	}

	@Test
	public void testNewCalculatorHasAnAccumulatorOfZero() {
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
	}

	@Test
	public void testSettingAccumulatorValue() {
		BigDecimal value = new BigDecimal(23);
		calculator.setAccumulator(value);
		assertEquals(value, calculator.getAccumulator());
	}
}
