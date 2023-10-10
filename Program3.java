import java.util.Scanner;

class Main { 
  public static void main(String[] args) {
    
    double pi = 3.1415;
    

    Scanner input = new Scanner(System.in);
    
    System.out.print("Input the radius: ");

    double radius = input.nextDouble(); 

    if (radius > 0) {
      double area = pi * radius * radius;
      System.out.println("The area is " + area);
    } 
    
    else {
      System.out.println("Enter a radius greater than zero!");
    }

    input.close();
  }
}
