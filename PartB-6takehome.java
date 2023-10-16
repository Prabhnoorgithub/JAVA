import java.util.Scanner;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Language Preferences:");
        System.out.println("1. English (e)");
        System.out.println("2. French (f)");
        System.out.println("3. German (g)");

        System.out.print("Please select your language preference (e/f/g): ");
        char choice = scanner.next().charAt(0);

        String greeting = getGreetingByLanguage(choice);

        if (greeting != null) {
            System.out.println("Greeting in your preferred language:");
            System.out.println(greeting);
        } else {
            System.out.println("Apologies, we don't have a greeting in your preferred language.");
        }
    }

    private static String getGreetingByLanguage(char choice) {
        char lowerCaseChoice = Character.toLowerCase(choice);

        if (lowerCaseChoice == 'e') {
            return "Hello! Welcome to our program.";
        } else if (lowerCaseChoice == 'f') {
            return "Bonjour ! Bienvenue dans notre programme.";
        } else if (lowerCaseChoice == 'g') {
            return "Hallo! Willkommen in unserem Programm.";
        }  else {
            return null; 
        }
    }
}
