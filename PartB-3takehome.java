import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();
    if (number1>number2){
        if (number1>number3){
          System.out.println("number 1 is the largest");
        }
    }
      else
    {   
      if(number2>number3){
        System.out.println("number 2 is largest");
          }
   else 
      {
        System.out.println("number 3 is the largest");
      }
  }
    
    input.close();
  }
}
