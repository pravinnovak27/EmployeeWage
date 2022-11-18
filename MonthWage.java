package jlk;

public class EmployeeWageUC5 {
    public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 160;

	public static void main(String[] args) {
	int empHrs = 8, totalEmpHrs = 160, totalWorkingDays = 20;
    while ((totalEmpHrs <= MAX_HRS_IN_MONTH) && (totalWorkingDays <= MAX_WORKING_DAYS)) {
			int Emp_Check = (int) Math.floor(Math.random() * 10) % 3;

			switch (Emp_Check) {
			case IS_FULL_TIME:
				System.out.println("Employee Present : Full Time");
				empHrs = 160;
				break;

			case IS_PART_TIME:
				System.out.println("Employee is Present : Part Time");
				empHrs = 160;
				break;

			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}
			totalEmpHrs =+ empHrs;
			System.out.println("Employee Wage is : " + empHrs);

			totalWorkingDays++;
		}
		int totalMonthlyWage = totalEmpHrs * EMP_WAGE_PER_HR;
		System.out.println("Employee worked " + totalEmpHrs + " Hrs in " + (totalWorkingDays - 1) + " days.");
		System.out.println("Monthly Wage of employee is : " + totalMonthlyWage);
	}
}
