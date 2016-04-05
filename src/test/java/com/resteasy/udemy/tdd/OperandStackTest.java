package com.resteasy.udemy.tdd;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class OperandStackTest {

	OperandStack operandStack;

	@Before
	public void createOperandStack() {
		operandStack = new OperandStack();
	}

	@Test
	public void testNewOperandStackPeekReturnsZero() {
		assertEquals(BigDecimal.ZERO, operandStack.peek());
	}

	@Test
	public void testPushingValueOntoStack() {
		BigDecimal value = new BigDecimal(12);
		operandStack.push(value);
		assertEquals(value, operandStack.peek());
	}

	@Test
	public void testReplacingTopOfStack() {
		operandStack.push(new BigDecimal(22));
		BigDecimal value = new BigDecimal(66);
		operandStack.replaceTop(value);
		assertEquals(value, operandStack.peek());
	}

	@Test
	public void testReplacingTopWithEmptyStack() {
		BigDecimal value = new BigDecimal(66);
		operandStack.replaceTop(value);
		assertEquals(value, operandStack.peek());
	}

	@Test
	public void testPoppingValuesFromStack() {
		BigDecimal value = new BigDecimal(66);
		operandStack.push(value);
		operandStack.push(new BigDecimal(5));
		operandStack.pop();
		assertEquals(value, operandStack.peek());
	}

	@Test
	public void testPoppingValuesFromEmptyStack() {
		operandStack.pop();
		assertEquals(BigDecimal.ZERO, operandStack.peek());
	}


}
