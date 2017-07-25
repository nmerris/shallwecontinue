package shallwecontinue;

import java.util.Scanner;

public class ShallWeContinue {

	public static void main(String[] args) {

		// this simple program asks the user if they want to continue
		// the program continues indefinitely unless either N or n are entered
		// an error message is displayed as necessary
		
		String response = null; // the users input
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.println("Would you like to continue?");
			response = scanner.nextLine(); // store user input
			
			if(!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
				// user did not enter Y or y or N or n
				// so display an error message and set response to y
				System.out.println("Please enter only Y or y or N or n");
				response = "y"; // this will do another loop iteration
			}
			
		} while(response.equalsIgnoreCase("y"));
		
		
		
		
		

	}

}
