package com.resteasy.udemy.tdd;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class CalculatorWithThreeValuesTest {

	Calculator calculator;
	BigDecimal value1;
	BigDecimal value2;
	BigDecimal value3;

	@Before
	public void createCalculator() {
		calculator = new Calculator();
		value1 = new BigDecimal(12);
		value2 = new BigDecimal(22);
		value3 = new BigDecimal(52);
		calculator.setAccumulator(value1);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
	}

	@Test
	public void testEnteringAndDroppingValues() {
		assertEquals(value3, calculator.getAccumulator());
		calculator.drop();
		assertEquals(value2, calculator.getAccumulator());
		calculator.drop();
		assertEquals(value1, calculator.getAccumulator());
	}

}
