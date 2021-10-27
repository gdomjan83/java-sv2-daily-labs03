package day03;

import java.util.Random;

public class GuessTheNumber {
    private int maxGuesses;
    private int secretNumber = new Random().nextInt(1, 101);
    private boolean gameWon = false;

    public GuessTheNumber(int maxGuesses) {
        this.maxGuesses = maxGuesses;
    }

    public int getMaxGuesses() {
        return maxGuesses;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public String makeGuess(int guess) {
        if (guess == secretNumber) {
            gameWon = true;
            return "Igen, ez volt az.";
        } else if (guess < secretNumber) {
            return "Nem, a gondolt szám nagyobb.";
        } else {
            return "Nem, a gondolt szám kisebb.";
        }
    }
}
