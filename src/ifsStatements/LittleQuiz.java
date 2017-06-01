package ifsStatements;

import java.util.Scanner;

public class LittleQuiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Are you ready to find out if you're smarter than a 5th grader?");
		
		String startGame = input.next();
		
		int point = 0;
		
		if (startGame.equals("Y")) {
			System.out.println("Okay lets get started.");
			
		} else if (startGame.equals("N")) {
			System.out.println("Wow I did'nt want to play with you anyways! BUH BYE");
			System.exit(0);
		}
		
		System.out.println("\nWhat U.S. national park, located in the Northwest \ncorner of Montana, has the nickname \"Crown of the Continent\"?");
		String answer1 = input.next();
		if (answer1.equalsIgnoreCase("Glacier National Park")) {
			System.out.println("That's correct! you have ");
		}
		
	}

}
