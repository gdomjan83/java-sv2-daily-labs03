package day03;

import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber(6);
        Scanner sc = new Scanner(System.in);

        System.out.println("Gondoltam egy számra 1 és 100 között. Melyik lehet az?" + game.getSecretNumber());
        for (int i = 0; i < game.getMaxGuesses(); i++) {
            int guess = sc.nextInt();
            String result = game.makeGuess(guess);
            System.out.println(result);;
            if (game.isGameWon()) {
                break;
            }
        }
        if (!game.isGameWon()) {
            System.out.println("Sajnos nem találtad ki a számot.");
        }
    }
}
