package com.training.employee_wage_computation;

public class EmployeeWageApplication {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		IEmployeeWageBuilder wageBuilder = new EmployeeWageBuilder();

		wageBuilder.addCompany("TCS", 20, 20, 100);
		wageBuilder.addCompany("Infosys", 25, 22, 110);

		wageBuilder.computeWages();

		int tcsWage = wageBuilder.getTotalWageByCompany("TCS");
		System.out.println("Queried Total Wage for TCS: " + tcsWage);
	}
}
