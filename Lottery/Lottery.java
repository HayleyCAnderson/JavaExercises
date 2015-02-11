import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Lottery {
  public Scanner reader;
  public Random randomGenerator;
  public ArrayList lotteryPool;

  public Lottery() {
    reader = new Scanner(System.in);
    randomGenerator = new Random();
    lotteryPool = new ArrayList();
  }

  public static void main(String[] args) {
    Lottery lottery = new Lottery();
    lottery.welcome();
    lottery.getNames();
    lottery.chooseWinner();
  }

  private void welcome() {
    System.out.println("-----");
    System.out.println("Welcome to The Lottery!");
    System.out.println("Enter a list of names followed by a blank line.");
    System.out.println("-----");
  }

  private void getNames() {
    System.out.print("> ");
    String name = reader.nextLine();

    while (!name.isEmpty()) {
      lotteryPool.add(name);

      System.out.print("> ");
      name = reader.nextLine();
    }
  }

  private void chooseWinner() {
    int lotterySize = lotteryPool.size();
    int chosenIndex = randomGenerator.nextInt(lotterySize);

    System.out.println("-----");
    System.out.println(lotteryPool.get(chosenIndex) + " wins!");
    System.out.println("-----");
  }
}
