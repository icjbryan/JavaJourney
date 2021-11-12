
public class Main {
	
	public static double employeeGrossAnnualSalary(double numberOfHoursWorked, double paidPerHour, int vacationDays) {
		// makes invalid
		if(numberOfHoursWorked < 0) {
			return -1;
		}
		if(paidPerHour < 0) {
			return -1;
		}
		
		//vacation days bonus
		
		
		double weeklySalary = numberOfHoursWorked * paidPerHour;
		double unpaidTime = vacationDays * paidPerHour * 8;
		double result = weeklySalary * 52 - unpaidTime;
		return result;
		
	}

	public static void main(String[] args) {
		double yourAnnualIncome = employeeGrossAnnualSalary(40, 15, 0);
		System.out.println(yourAnnualIncome);
	}

}


//Input1 numbersOfHoursWorked per week
//Input2 paidPerHour
//Output employeeGrossAnnualSalary