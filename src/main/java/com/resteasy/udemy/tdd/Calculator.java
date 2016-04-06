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

	public void execute(String requestedOperation) {
		Operation operation = null;
		if ("+".equals(requestedOperation)) {
			operation = new AddOperation();
		} else if ("-".equals(requestedOperation)) {
			operation = new SubtractOperation();
		} else if ("*".equals(requestedOperation)) {
			operation = new MultiplyOperation();
		} else if ("/".equals(requestedOperation)) {
			operation = new DivideOperation();
		} else if ("Sq".equals(requestedOperation)) {
			operation = new SquareOperation();
		}
		operation.apply(stack);
	}
}
