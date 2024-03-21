package lessons;
import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		int test4 = 0;
		int average = 0;
		
		// output
		System.out.println("Welcome to average calculator!\n");
		System.out.println("Enter Test1 score: ");
		test1 = sc.nextInt();
		System.out.println("Enter Test2 score: ");
		test2 = sc.nextInt();  
		System.out.println("Enter Test3 score: ");
		test3 = sc.nextInt();
		System.out.println("Enter Test4 score: ");
		test4 = sc.nextInt();
		
		// processing
		average = (test1 + test2 + test3 + test4) / 4;
		
		// output
		System.out.println("Average score is: " + average);
		
		
		
	}

}
