package com.resteasy.udemy.tdd;

import java.math.BigDecimal;

/**
 * Created by Ant Brown on 04/04/2016.
 */
public class Calculator {
	private BigDecimal accumulator;

	public BigDecimal getAccumulator() {
		return accumulator;
	}

	public void setAccumulator(BigDecimal value) {
		accumulator = value;
	}
}
