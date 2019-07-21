import java.util.Random;
import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("How many sides should each die have? ");
		int dieSides = scan.nextInt();
		
		System.out.println("Roll 1:");
		System.out.println(generateRandomDieRoll(dieSides));
		System.out.println(generateRandomDieRoll2(dieSides));
		
		System.out.println();
		System.out.println("Roll again? (y/n): ...");
		cont = scan.next();
		
		}
		
		System.out.println("Thank you for playing!");
	}
	
		public static int generateRandomDieRoll(int dieNumber) {
			Random die1 = new Random();
			return die1.nextInt(dieNumber ) +1;
		}
		
		public static int generateRandomDieRoll2(int dieNumber2) {
			Random die2 = new Random();
			return die2.nextInt(dieNumber2) + 1;
		
}
}
