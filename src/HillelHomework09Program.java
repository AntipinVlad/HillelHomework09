import java.util.Random;
import java.util.Scanner;

public class HillelHomework09Program {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        final int pcNumber = random.nextInt(11);
        final int guesses = 3;

        for (int i = 0; i < guesses; i++ ) {
            System.out.println("Please enter number in zone 0 - 10");
            int userNumber = scanner.nextInt();
            if (userNumber == pcNumber) {
                System.out.println("That's right, the computer guessed the number: " + pcNumber);
                break;
            } else {
                if (i != (guesses - 1)) {
                    System.out.println("Nope, try again");
                } else {
                    System.out.println("You guessed wrong, the correct number: " + pcNumber);
                }
            }
        }
    }
}
