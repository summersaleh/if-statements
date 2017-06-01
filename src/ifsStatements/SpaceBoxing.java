package ifsStatements;

import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double venus = .78;
		double mars = .39;
		double jupiter = 2.65;
		double saturn = 1.17;
		double uranus = 1.05;
		double neptune = 1.23;
		double newWeight = 0;

		System.out.println("Please enter your current earth weight:");
		double weight = input.nextDouble();

		System.out.println(
				"I have information for the following planets: \n 1. Venus   2. Mars   3. Jupiter \n 4. Saturn  5. Uranus 6. Neptune");
		System.out.println("\n Which planet are you visiting?");

		int answer = input.nextInt();

		if (answer == 1) {
			newWeight = weight * venus;

		} else if (answer == 2) {
			newWeight = weight * mars;
		} else if (answer == 3) {
			newWeight = weight * jupiter;
		} else if (answer == 4) {
			newWeight = weight * saturn;
		} else if (answer == 5) {
			newWeight = weight * uranus;
		} else if (answer == 6) {
			newWeight = weight * neptune;
		}
		
		System.out.println("Your weight would be " + newWeight + " on that planet.");
		
		input.close();
	}
}
