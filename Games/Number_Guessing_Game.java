import java.util.Scanner;

 /*
 * Purpose: This program's purpose is to showcase a number guessing game where you the user are supposed to guess a number that the computer guesses to be the number. You have a limited amount of guesses if it low or high then it would be say "Too Low" or "Too High".
 * Author: Ryan Shuck
 * Language: Java (IntelliJ IDEA Ultimate 2024.1.1)
 * Date of creation: 8/28/24
 * Date of last revision: 8/28/24
 * Citation of sources: None
 */

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game! In this game you play against a computer who generates a random number between 1 to 100 or 1 to 1000");
        System.out.println("This game has two options playing with guessing a number from 1-10 or 1-1000");
        System.out.println("Please enter 1 for your number to be between 1 and 100 or enter 2 for your number to be between 1 and 1000: ");

        int input = myObj.nextInt();

        if(input != 1 && input != 2){
            System.out.println("You did not enter 1 or 2! Try again!");
            System.out.println("Please enter 1 for your number to be between 1 and 100 or enter 2 for your number to be between 1 and 1000: ");
            input = myObj.nextInt();
        }

        if(input == 1){
            System.out.println("Your number is between 1 and 100");
        }
        else{
            System.out.println("Your number is between 1 and 1000");
        }

    }
}