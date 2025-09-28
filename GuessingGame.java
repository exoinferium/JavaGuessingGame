import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
	int number;
	
	public static final int MAX_NUMBER = 100;
	public static final int MAX_TRIES = 10;
	public static int TotalTries = 0;
	public static int NumGames = 0;

	public GuessingGame(int number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		Random rgen = new Random();
		Scanner input = new Scanner(System.in);
		GuessingGame myNum = new GuessingGame(rgen.nextInt(MAX_NUMBER)+1);
		int number = myNum.number;
		int guess = 0;
		int tries = 0;
		while(guess != number && tries < 10) {
			tries++;
			System.out.println("guess a number between 1 and 100: ");
			guess = input.nextInt();
			if(guess > number) {
				System.out.println("too high");
			}else if(guess < number) {
				System.out.println("too low");
			}else {
				System.out.println("you are correct");
				NumGames++;
				TotalTries += tries;
				System.out.println("you guessed it in " + tries + " tries");
				System.out.println("you have played " + NumGames + " games");
				System.out.println("you have guessed " + TotalTries + " times in total");
				main(new String[0]);
			}
			System.out.println("tries left: " + (10-tries));
		}
		System.out.println("you lost");
	}

}
