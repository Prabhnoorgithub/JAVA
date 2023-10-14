import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name1 = "Prabhnoor";
    System.out.print("Enter your name: ");
    String name2 = scanner.nextLine();
    if (name2.equals(name1)) {
    System.out.println("Your name is the same.");
    } else {
    System.out.println("Your name is different.");
    }
    scanner.close();
    }
}
