package com.resteasy.udemy.tdd;

import java.math.BigDecimal;

/**
 * Created by Ant Brown on 06/04/2016.
 */
public class SquareOperation extends UnaryOperation {
	protected BigDecimal calculate(BigDecimal value1) {
		return value1.multiply(value1);
	}
}
