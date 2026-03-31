package com.junit.practice.junitTesting;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
	private final MathUtils mathUtils = new MathUtils();
	
	@Test
	void testDividebyZeroException() {
		assertThrows(ArithmeticException.class, () -> {
			mathUtils.divide(10, 0);
		});
	}
}
