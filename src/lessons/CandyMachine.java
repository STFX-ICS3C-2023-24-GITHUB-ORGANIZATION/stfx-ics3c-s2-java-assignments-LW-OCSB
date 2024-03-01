package lessons;
import java.util.Scanner;

public class CandyMachine {

	public static void main(String[] args) {
		
		// variables
		final double TAX = 0.13;
		Scanner inputGetter = new Scanner(System.in);
		double candyCost = 0.0;
		double candyTax = 0.0;
		double grandTotal = 0.0;
		
		// output
		System.out.println("Welcome to Candy Machine!\n");
		System.out.println("Choices are (without tax): \n");
		System.out.println("1. Potato Chips $2.00");
		System.out.println("2. Chocolate Bar $1.50");
		System.out.println("3. Rice Crispies $2.55\n");
		System.out.println("Your choice (just enter cost): ");
		
		// get cost
		candyCost = inputGetter.nextDouble();
		
		// calculate tax
		candyTax = candyCost * TAX;
		System.out.println("Tax: $" + candyTax);
		
		// print subtotal
		System.out.println("The subtotal is: $" + candyCost);
		
        // calculate grand total
		grandTotal = candyCost + candyTax;
		
		// print grand total
		System.out.println("The grand total is: $" + grandTotal);
		
	}

}
