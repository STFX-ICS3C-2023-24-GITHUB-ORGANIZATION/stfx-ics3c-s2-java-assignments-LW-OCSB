package lessons;
import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {
		
		// variables
		Scanner inputGetter = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 0;
		int sum = 0;
		
		// output
		System.out.println("Welcome to the add calculator.\n");
		System.out.print("Enter first number: ");

		// get first number
		firstNumber = inputGetter.nextInt();
		
		// ask for second number
		System.out.print("Enter second number: ");
		
		// get second number
		secondNumber = inputGetter.nextInt();
		
		// add 2 numbers and put in new shoebox
		sum = firstNumber + secondNumber;
		
		// print answer
		System.out.println("Your answer is " + sum);
		
	}

}
