import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");

      
        System.out.print("Player 1: ");
        int player1Choice = scanner.nextInt();
        System.out.print("Player 2: ");
        int player2Choice = scanner.nextInt();

       
        if (player1Choice == player2Choice) {
            System.out.println("It's a tie!");
        } else if ((player1Choice == 1 && player2Choice == 3) || (player1Choice == 2 && player2Choice == 1) || (player1Choice == 3 && player2Choice == 2)) {
            System.out.println("Player 1 wins! Rock beats Scissors.");
        } else {
            System.out.println("Player 2 wins! " + getChoiceName(player2Choice) + " beats " + getChoiceName(player1Choice) + ".");
        }
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }
}
