package com.training.employee_wage_computation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageBuilder implements IEmployeeWageBuilder {

	private static final int FULL_TIME_HOURS = 8;
	private static final int PART_TIME_HOURS = 4;

	private final List<CompanyEmployeeWage> companies;

	public EmployeeWageBuilder() {
		companies = new ArrayList<>();
	}

	@Override
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

		companies.add(new CompanyEmployeeWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours));
	}

	@Override
	public void computeWages() {

		companies.forEach(company -> {

			int totalWorkingHours = 0;
			int totalWorkingDays = 0;
			int totalWage = 0;

			while (totalWorkingHours <= company.getMaxWorkingHours()
					&& totalWorkingDays < company.getMaxWorkingDays()) {

				totalWorkingDays++;

				int attendance = (int) (Math.random() * 3);
				int workingHours = 0;

				switch (attendance) {
				case 1:
					workingHours = FULL_TIME_HOURS;
					break;
				case 2:
					workingHours = PART_TIME_HOURS;
					break;
				default:
					workingHours = 0;
				}

				int dailyWage = workingHours * company.getWagePerHour();
				totalWorkingHours += workingHours;
				totalWage += dailyWage;

				company.addDailyWage(dailyWage);
			}

			company.setTotalWage(totalWage);
			System.out.println(company);
		});
	}

	@Override
	public int getTotalWageByCompany(String companyName) {

		return companies.stream().filter(c -> c.getCompanyName().equals(companyName))
				.map(CompanyEmployeeWage::getTotalWage).findFirst().orElse(0);
	}
}
