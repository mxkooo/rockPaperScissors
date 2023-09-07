import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerWins = 0;
        int playerWins = 0;
        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Enter your move (r, p or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + "is not a valid move");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("Computer won");
                    computerWins++;
                    System.out.println("Your wins " + playerWins);
                    System.out.println("Computer wins " + computerWins);
                } else if (computerMove.equals("s")) {
                    System.out.println("You win");
                    playerWins++;
                    System.out.println("Your wins " + playerWins);
                    System.out.println("Computer wins " + computerWins);
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("Computer won");
                    computerWins++;
                    System.out.println("Your wins " + playerWins);
                    System.out.println("Computer wins " + computerWins);
                } else if (computerMove.equals("r")) {
                    System.out.println("You win");
                    playerWins++;
                    System.out.println("Your wins " + playerWins);
                    System.out.println("Computer wins " + computerWins);
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You lost");
                    computerWins++;
                    System.out.println("Your wins " + playerWins);
                    System.out.println("Computer wins " + computerWins);
                } else if (computerMove.equals("p")) {
                    System.out.println("You win");
                    playerWins++;
                    System.out.println("Your wins " + playerWins);
                    System.out.println("Computer wins " + computerWins);
                }
            }
            System.out.println("play again?(y/n)");
            String res = scanner.nextLine();
            if (!res.equals("y")) {
                break;
            }
        }
            scanner.close();
    }
}