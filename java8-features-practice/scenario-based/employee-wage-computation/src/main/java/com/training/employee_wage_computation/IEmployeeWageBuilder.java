package com.training.employee_wage_computation;

public interface IEmployeeWageBuilder {

	void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);

	void computeWages();

	int getTotalWageByCompany(String companyName);
}
