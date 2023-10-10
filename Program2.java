import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();
        
        if (grade >= 80) {
            System.out.println("More than 80%");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("More than 60%");
        } else if (grade >= 40 && grade < 60) {
            System.out.println("Average");
        } else {
            System.out.println("Failed");
        }
        
        scanner.close();
    }
}

