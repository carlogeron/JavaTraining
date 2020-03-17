package basics;

public class SalaryCalculator {
	public static void main(String args[]) {
		String career; 
		career = "ASE";
		System.out.println("Program is starting" );
		System.out.println("My Career is: " + career);
		
		int hoursPerWeek = 40;
		int weekPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weekPerYear;
		System.out.print("My Salary as a " + career + "at the rate of $" + rate + " per hour is $" + salary + " per year");
		
		
		
	}
	

}
