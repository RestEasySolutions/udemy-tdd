package com.resteasy.udemy.tdd;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class Calculator {
	private Stack<BigDecimal> values = new Stack<BigDecimal>();

	public BigDecimal getAccumulator() {
		return values.peek();
	}

	public void setAccumulator(BigDecimal value) {
		values.pop();
		values.push(value);
	}

	public void enter() {
	}

	public void drop() {
	}
}
