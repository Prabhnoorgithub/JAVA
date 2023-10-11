import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Question 1
    System.out.print("5 + 5 = ");
    int answer1 = 10;
    int userAnswer1 = scanner.nextInt();

    if (userAnswer1 == answer1) {
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }

    // Question 2
    System.out.print("25 / 5 = ");
    int answer2 = 5;
    int userAnswer2 = scanner.nextInt();

    if (userAnswer2 == answer2) {
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }

    // Question 3
    System.out.print("10 * 5 = ");
    int answer3 = 50;
    int userAnswer3 = scanner.nextInt();

    if (userAnswer3 == answer3) {
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }

    scanner.close();
  }
}
