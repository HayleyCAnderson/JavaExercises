public class FizzBuzz {
  public static void main(String[] args) {
    int lowerbound = 1;
    int upperbound = 100;

    for (int number = lowerbound; number <= upperbound; ++number) {
      if ((number % 2) == 0) {
        System.out.print("Fizz");
      }
      if ((number % 3) == 0) {
        System.out.print("Buzz");
      }
      if (((number % 2) != 0) && ((number % 3) != 0)) {
        System.out.print(number);
      }

      System.out.println();
    }
  }
}

