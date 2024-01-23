import java.util.Random;
import java.util.Scanner;

public class GameRockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ROCK = "Rock";
        String PAPER = "Paper";
        String SCISSORS = "Scissors";

        System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");

        String playersInput = scanner.nextLine();

        if (playersInput.equals("r") || playersInput.equals("rock")) {
            playersInput = ROCK;
        } else if (playersInput.equals("p") || playersInput.equals("paper")) {
            playersInput = PAPER;
        } else if (playersInput.equals("s") || playersInput.equals("scissors")) {
            playersInput = SCISSORS;
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerInput = "";

        switch (computerRandomNumber) {
            case 1:
                computerInput = "Rock";
                break;
            case 2:
                computerInput = "Paper";
                break;
            case 3:
                computerInput = "Scissors";
                break;
        }
        System.out.println("The computer chose " + computerInput + ".");

        if (playersInput.equals(ROCK) && computerInput.equals(SCISSORS)
                || playersInput.equals(PAPER) && computerInput.equals(ROCK)
                || playersInput.equals(SCISSORS) && computerInput.equals(PAPER)) {
            System.out.println("You win.");
        } else if (playersInput.equals(ROCK) && computerInput.equals(PAPER) ||
                playersInput.equals(PAPER) && computerInput.equals(SCISSORS) ||
                playersInput.equals(SCISSORS) && computerInput.equals(ROCK)) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }
    }
}