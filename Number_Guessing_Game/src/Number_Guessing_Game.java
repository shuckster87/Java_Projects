import java.util.Scanner;
import java.util.Random;

 /*
 * Purpose: This program's purpose is to showcase a number guessing game where you the user are supposed to guess a number that the computer guesses to be the number. You have a limited amount of guesses to guess the number.
 * Author: Ryan Shuck
 * Language: Java (IntelliJ IDEA Ultimate 2024.1.1)
 * Date of creation: 8/28/24
 * Date of last revision: 8/29/24
 * Citation of sources: None
 */

public class Number_Guessing_Game {
    public static void guess_100(Random r, Scanner s){
        int guess_1;
        int num_guesses_1 = 0;
        System.out.println("Your number is between 1 and 100");
        System.out.println("You have 10 guesses to guess the number correctly.");
        int guess_100 = r.nextInt(100) + 1;

        for(int i = 10; i > 0; i--){
            System.out.println("Enter a number between 1 and 100: ");
            guess_1 = s.nextInt();
            num_guesses_1++;

            //Guessed Correctly Situation
            if(guess_1 == guess_100){
                System.out.println("You Guessed Correctly! Congratulations!");
                System.out.println("The number was " + guess_100 + " and it took you " + num_guesses_1 + " guesses to guess the number correctly.");
                break;
            }
            //Very Close Guess Situation
            else if(Math.abs(guess_1 - guess_100) <= 5){
                System.out.println("Very Close! Try again!");
            }
            //Close Guess Situation
            else if(Math.abs(guess_1 - guess_100) <= 15){
                System.out.println("Close! Try again!");
            }
            //Too Low and Too High Situations
            else if(guess_1 < guess_100){
                System.out.println("Too Low! Try again!");
            }
            else {
                System.out.println("Too High! Try again!");
            }

            System.out.println("You have " + (i-1) + " guesses to guess the number correctly.");

            //Running Out of Guesses Situation
            if(num_guesses_1 == 10){
                System.out.println("Game Over! You didn't guess the number correctly");
            }
        }
        play_again();
    }

    public static void guess_1000(Random r, Scanner s){
        int guess_2;
        int num_guesses_2 = 0;
        System.out.println("Your number is between 1 and 1000");
        System.out.println("You have 20 guesses to guess the number correctly.");

        int guess_1000 = r.nextInt(1000) + 1;

        for(int i = 20; i > 0; i--){
            System.out.println("Enter a number between 1 and 1000: ");
            guess_2 = s.nextInt();
            num_guesses_2++;

            //Guessed Correctly Situation
            if(guess_2 == guess_1000){
                System.out.println("You Guessed Correctly! Congratulations!");
                System.out.println("The number was " + guess_1000 + " and it took you " + num_guesses_2 + " guesses to guess the number correctly.");
                break;
            }
            //Very Close Guess Situation
            else if(Math.abs(guess_2 - guess_1000) <= 10){
                System.out.println("Very Close! Try again!");
            }
            //Close Guess Situation
            else if(Math.abs(guess_2 - guess_1000) <= 30){
                System.out.println("Close! Try again!");
            }
            //Too Low and Too High Situations
            else if(guess_2 < guess_1000){
                System.out.println("Too Low! Try again!");
            }
            else{
                System.out.println("Too High! Try again!");
            }

            System.out.println("You have " + i + " guesses to guess the number correctly.");

            //Running Out of Guesses Situation
            if(num_guesses_2 == 20){
                System.out.println("Game Over! You didn't guess the number correctly");
            }
        }
        play_again();
    }

    public static void play_game(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game! In this game you play with a computer who generates a random number between 1 to 100 or 1 to 1000");
        System.out.println("This game has two options playing with guessing a number from 1-10 or 1-1000");
        System.out.println("Please enter 1 for your number to be between 1 and 100 or enter 2 for your number to be between 1 and 1000: ");

        int input = myObj.nextInt();
        Random random = new Random();

        if(input != 1 && input != 2){
            System.out.println("You did not enter 1 or 2! Try again!");
            System.out.println("Please enter 1 for your number to be between 1 and 100 or enter 2 for your number to be between 1 and 1000: ");
            input = myObj.nextInt();
        }

        if(input == 1){
            guess_100(random, myObj);
        }
        else{
            guess_1000(random, myObj);
        }

    }

    public static void play_again(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Did you want to play again? (Enter yes or no)");
        String answer = myObj.nextLine();

        if(!answer.equals("yes") && !answer.equals("no")){
            System.out.println("You didn't enter yes or no! Try again!");
            play_again();
        }

        if(answer.equals("yes")){
            play_game();
        }
    }

    public static void main(String[] args) {
        play_game();
    }
}