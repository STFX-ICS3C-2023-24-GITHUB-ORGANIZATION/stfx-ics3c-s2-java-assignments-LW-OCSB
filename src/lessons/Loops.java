package lessons;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		System.out.println("How many times would you like me to say Happy Birthday?");
		userInput = sc.nextInt();
		
		for (int i=0; i<userInput; i++)  {
			
			System.out.println("Happy Birthday!");
		}
		
	}

}
