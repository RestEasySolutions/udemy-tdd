package com.resteasy.udemy.tdd;

import java.math.BigDecimal;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class Calculator {
	private OperandStack stack = new OperandStack();

	public BigDecimal getAccumulator() {
		return stack.peek();
	}

	public void setAccumulator(BigDecimal value) {
		stack.replaceTop(value);
	}

	public void enter() {
		stack.push(getAccumulator());
	}

	public void drop() {
		stack.pop();
	}

	public void add() {
		BigDecimal value1 = stack.peek();
		stack.pop();
		BigDecimal value2 = stack.peek();
		stack.replaceTop(value1.add(value2));
	}

	public void subtract() {
		BigDecimal value1 = stack.peek();
		stack.pop();
		BigDecimal value2 = stack.peek();
		stack.replaceTop(value2.subtract(value1));
	}
}
