package com.training.employee_wage_computation;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployeeWage {

	private final String companyName;
	private final int wagePerHour;
	private final int maxWorkingDays;
	private final int maxWorkingHours;

	private int totalWage;
	private final List<Integer> dailyWages;

	public CompanyEmployeeWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.dailyWages = new ArrayList<>();
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public int getMaxWorkingDays() {
		return maxWorkingDays;
	}

	public int getMaxWorkingHours() {
		return maxWorkingHours;
	}

	public void addDailyWage(int wage) {
		dailyWages.add(wage);
	}

	public List<Integer> getDailyWages() {
		return dailyWages;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public int getTotalWage() {
		return totalWage;
	}

	@Override
	public String toString() {
		return "Company: " + companyName + ", Total Wage: " + totalWage;
	}
}
