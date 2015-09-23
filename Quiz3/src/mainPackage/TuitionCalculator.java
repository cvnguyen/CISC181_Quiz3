package mainPackage;
import java.util.Scanner;

//Quiz 2 - mistake in naming project, I'm sorry for this!
//Cindy



public class TuitionCalculator {
		//private variables
		private static int year;
		private static double initialTuitionCost = 0;
		private static double totalTuitionCost = 0;
		private static double interestRate, percentIncrease;
	
	public TuitionCalculator(){
		
		//scan in values
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter your year (1,2,3,4): ");
		year = sc.nextInt();		
		System.out.println("Please enter initial first-year tuition cost: ");
		initialTuitionCost = sc.nextDouble();
		System.out.println("Please enter the yearly percent increase as a decimal: ");
		percentIncrease = sc.nextDouble();
		System.out.println("Please enter the APR rate: ");
		interestRate = sc.nextDouble();
				
		sc.close(); //close scanner
		
		//calculate total tuition cost
		for (year = 0; year < 4; year++){
			totalTuitionCost += initialTuitionCost*Math.pow(1+percentIncrease, year);
		}
		
		System.out.printf("Your total tuition costfor 4 years is $%.2f", totalTuitionCost);
	}

}
