import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Player 1, enter your choice (1/2/3 or rock/paper/scissors): ");
        String player1Choice = scanner.nextLine().toLowerCase();

        System.out.print("Player 2, enter your choice (1/2/3 or rock/paper/scissors): ");
        String player2Choice = scanner.nextLine().toLowerCase();

        // Determine the winner
        String result = determineWinner(player1Choice, player2Choice);

        System.out.println("Player 1 chose: " + player1Choice);
        System.out.println("Player 2 chose: " + player2Choice);

        if (result.equals("tie")) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("The winner is: " + result);
        }
    }

    private static String determineWinner(String choice1, String choice2) {
        if (choice1.equals(choice2)) {
            return "tie";
        } else if ((choice1.equals("rock") && choice2.equals("scissors")) ||
                   (choice1.equals("paper") && choice2.equals("rock")) ||
                   (choice1.equals("scissors") && choice2.equals("paper"))) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }
}
