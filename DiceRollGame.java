import java.util.Scanner;
import java.util.Random;

public class DiceRollGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int result = 0;
		int times;
		int fresult = 0;
		int guess;
		
		
		System.out.println("How many times would you like to roll? ");
		times = input.nextInt();
		Rolls number = new Rolls();
		number.setRolls(times);
		
		
		for(int i = 0; i<times; i++)
		{
			result = random.nextInt(6);
			result++;
			fresult = fresult + result;
		}
		
		System.out.println("What do you believe you rolled? ");
		guess = input.nextInt();
		
		number.setFinalResult(fresult);
		number.decision(guess);
		
	}

}
