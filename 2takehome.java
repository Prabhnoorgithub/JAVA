import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    if (num1 > num2) {
    System.out.println("The first number is greater");
    }
    else if (num1==num2) {
    System.out.println("The numbers are equal");
    } 
    else {
      System.out.println("The secound number is greater");
    }
  input.close();
  }
}
