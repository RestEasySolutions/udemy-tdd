package com.resteasy.udemy.tdd;

import java.math.BigDecimal;

/**
 * Created by Ant Brown on 06/04/2016.
 */
public class MultiplyOperation extends BinaryOperation {
	protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
		return value1.multiply(value2);
	}
}
