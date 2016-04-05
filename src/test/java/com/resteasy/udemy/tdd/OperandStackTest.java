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


}
