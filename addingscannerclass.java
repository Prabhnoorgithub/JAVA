import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
System.out.print("Enter two numbers");
    //takes input from the keyboard
    double num1=input.nextDouble();
    double num2=input.nextDouble();
    //prints the name
    System.out.println("Addition is " +
  (num1+num2));
    //closes the scanner
    input.close();
  }
  }
    
