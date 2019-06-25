import java.util.Scanner;

public class LabThree {

	private static Scanner scnr;
	
	public static void main(String[] args) {
		scnr = new Scanner(System.in);
		double userNumb = 0;
		String oddNumb = " Odd.";
		String evenNumb1 = "Even and less than 25.";
		String evenNumb2 = "Even.";
		String evenNumb3 = " Even.";
		String oddNumb2 = " and over 60";
		char cont = 'y';//Variable for asking the user if they want to try another number.
		
		while (cont == 'y') {
			System.out.println("Please enter a number between 1 and 100:");//Allow for user input
			userNumb = scnr.nextDouble();
			
			if((userNumb < 25) && (userNumb % 2) == 0) {// if the number is less than 25 and even
				System.out.println(evenNumb1);
			}
			else if((userNumb <= 60) && (userNumb >= 26) && (userNumb % 2) == 0) {// If the number is less than or equal to 60 and even
				System.out.println(evenNumb2);
			}
			else if((userNumb > 60) && (userNumb % 2) == 0) {//If the number is greater than 60 and even
				System.out.println(userNumb + evenNumb3);
			}
			else if(((userNumb % 2) != 0) && (userNumb <= 60)) {//If the number is odd and less than or equal to 60
				System.out.println(userNumb);
			}
			else if((userNumb > 60) && ((userNumb % 2) != 0) && (userNumb <= 100)) {//If the number is odd and greater than 60
				System.out.println(userNumb + oddNumb2);
			}
			else {
				System.out.println("You did not enter a number between 1 and 100");
			}
			System.out.println(" ");// Space for Visual esthetics
			System.out.println("Would you like to try another room? (Y/N)");// Option to do another room

			cont = scnr.next().charAt(0); // Gets first character so that the user can type in yes or no
			cont = Character.toLowerCase(cont); // Changes character to lower case so capitalization doesn't matter
		}
		System.out.println("Goodbye!");

	}

}
