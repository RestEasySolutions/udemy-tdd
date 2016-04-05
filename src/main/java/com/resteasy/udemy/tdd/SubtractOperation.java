package com.resteasy.udemy.tdd;

import java.math.BigDecimal;

/**
 * Created by Ant Brown on 05/04/2016.
 */
public class SubtractOperation implements Operation {
	public void apply(OperandStack stack) {
		BigDecimal value1 = stack.peek();
		stack.pop();
		BigDecimal value2 = stack.peek();
		stack.replaceTop(value2.subtract(value1));

	}
}
