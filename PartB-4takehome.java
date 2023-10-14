import java.util.Scanner;
class Main {
 public static void main(String[] args) {
Scanner reader = new Scanner(System.in);              
System.out.println("Enter your age: ");
int age = reader.nextInt();
if (age>=65) {
System.out.println("You are a senior citizen");
} 
else if (age>=20) {
System.out.println("You are an adult");
} 
else  if (age>=13) {
System.out.println("You are a teen");
}
else if (age<=12) {
System.out.println("You are a child");
}
reader.close();
  }
}
