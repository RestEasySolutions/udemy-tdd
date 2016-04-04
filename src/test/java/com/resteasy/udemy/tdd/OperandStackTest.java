package com.resteasy.udemy.tdd;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class OperandStackTest {
	@Test
	public void testNewOperandStackPeekReturnsZero() {
		OperandStack operandStack = new OperandStack();
		assertEquals(BigDecimal.ZERO, operandStack.peek());
	}
}
