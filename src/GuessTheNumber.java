/**
 * Author: Challa Saraswathi Lalith
 * Contact at:lalithcspersonal@gmail.com
 * Date:02-12-2023
 * Project: OIBSIP_Task2_NumberGuessing
 */
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rangeStart = 1;
        int rangeEnd = 100;
        int numberOfAttempts = 5;
        int points = 10;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I'm thinking of a number between " + rangeStart + " and " + rangeEnd);

        int randomNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
        int round = 1;
        while (round <= 5) {
            while (true) {
                System.out.println("Round " + round + " - You have " + numberOfAttempts + " attempts left. Points: " + points);
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else {
                    numberOfAttempts--;
                    if (numberOfAttempts == 0) {
                        System.out.println("Out of attempts. The number was " + randomNumber);
                        System.out.println("Total points gained="+points);
                        break;
                    } else {
                        if (userGuess < randomNumber) {
                            System.out.println("Try a higher number.");
                        } else {
                            System.out.println("Try a lower number.");
                        }
                        points -= 2; // Decrement points for incorrect guess
                    }
                }
                round++;
            }
            System.out.println("Do you want to continue to round 2?(Y=1/N=0)");
            System.out.print("Choice:");
            int ch=scanner.nextInt();
            if (ch==0){
                System.out.println("Thanks for playing!");
                scanner.close();
                return;
            }
            else{
                round++;
                continue;
            }
        }
    }
}

