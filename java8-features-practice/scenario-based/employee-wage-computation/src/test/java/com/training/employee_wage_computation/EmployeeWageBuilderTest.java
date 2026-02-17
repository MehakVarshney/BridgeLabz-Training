package com.training.employee_wage_computation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeWageBuilderTest {

	private EmployeeWageBuilder wageBuilder;

	@BeforeEach
	void setUp() {
		wageBuilder = new EmployeeWageBuilder();
		wageBuilder.addCompany("TestCompany", 20, 20, 100);
		wageBuilder.computeWages();
	}

	@Test
	void testTotalWageNotNegative() {
		int wage = wageBuilder.getTotalWageByCompany("TestCompany");
		assertTrue(wage >= 0);
	}

	@Test
	void testUnknownCompanyReturnsZero() {
		int wage = wageBuilder.getTotalWageByCompany("Unknown");
		assertEquals(0, wage);
	}

	@Test
	void testWageDoesNotExceedMaxPossible() {
		int wage = wageBuilder.getTotalWageByCompany("TestCompany");
		assertTrue(wage <= 20 * 100);
	}
}
