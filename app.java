import java.util.Random;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		int userChoice = 0;
		String winner;
		String[] cases = {"Rock", "Scissors", "Paper"};
		
		System.out.println("Welcome to game of Rock, Scissors and Paper");
		
		Scanner scan = new Scanner(System.in);
		boolean play = true;
		
		while (true) {
			System.out.println("""
					1)Rock
					2)Scissors
					3)Paper
					""");
			System.out.print("Choose one: ");
			try {
				userChoice = scan.nextInt();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			/*
			 * 1 beats 2 and loses to 3
			 * 2 beats 3 and loses to 1
			 * 3 beats 1 and loses to 2
			 */
			
			Random random = new Random();
			int computerChoice = random.nextInt(3) + 1;
			System.out.println("You choose: " + cases[userChoice - 1]);
			System.out.println("Computer choose: " + cases[computerChoice - 1]);
			
			if (userChoice == 1 && computerChoice == 2 ||
					userChoice == 2 && computerChoice == 3 ||
					userChoice == 3 && computerChoice == 1) {
				winner = "User";
			} else if (userChoice == computerChoice) {
				winner = "";
			} else {
				winner = "Computer";
			}
			
			if (winner.equals("")) {
				System.out.println("Draw!!");
			} else if (winner.equals("User")) {
				System.out.println("You win!!");
			} else {
				System.out.println("You lose!!");
			}
			
			System.out.print("Do you want to play again? ('Y'/'N') ");
			String again = scan.nextLine();
			if (again.equals("N")) {
				System.exit(0);
			}
		}
//		scan.close();
	
	}
}

