import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
  final static int ROUNDS = 5;

  public int wins;
  public int guesses;

  public GuessingGame() {
    wins = 0;
    guesses = 0;
  }

  public static void main(String[] args) {
    GuessingGame game = new GuessingGame();
    game.welcome();
    game.play();
    game.giveScore();
  }

  private void welcome() {
    System.out.println("-----");
    System.out.println("Welcome to Guessing Game!");
    System.out.println("-----");
  }

  private void play() {
    for (int round = 0; round < ROUNDS; ++round) {
      Round newRound = new Round();
      newRound.start();
      newRound.play();
      newRound.finish();
    }
  }

  private void giveScore() {
    float averageGuesses = (float) guesses / ROUNDS;

    System.out.println("Number of wins: " + wins);
    System.out.println("Average guesses per round: " + averageGuesses);
  }

  class Round {
    final static int ATTEMPTS = 3;

    public Scanner reader;
    public int randomNumber;

    public Round() {
      reader = new Scanner(System.in);

      Random randomGenerator = new Random();
      randomNumber = randomGenerator.nextInt(10) + 1;
    }

    private void start() {
      System.out.println("Guess a number between 1 and 10.");
    }

    private void play() {
      for (int attempt = 0; attempt < ATTEMPTS; ++attempt) {
        ++guesses;
        int answer = reader.nextInt();
        if (answer == randomNumber) {
          ++wins;
          System.out.println("Correct!");
          break;
        } else {
          System.out.println("Nope!");
        }
      }
    }

    private void finish() {
      System.out.println("The answer was: " + randomNumber);
      System.out.println("-----");
    }
  }
}
