package com.resteasy.udemy.tdd;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class OperandStack {
	private Stack<BigDecimal> values = new Stack<BigDecimal>();

	public BigDecimal peek() {
		if (values.empty()) {
			return BigDecimal.ZERO;
		}
		return values.peek();
	}

	public void push(BigDecimal value) {
		values.push(value);
	}

	public void replaceTop(BigDecimal value) {
		values.pop();
		values.push(value);
	}
}
