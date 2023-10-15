import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where are you from (Province or Country)? ");
        String region = scanner.nextLine();

        if (region.equalsIgnoreCase("Canada")) {
            System.out.println("Canada is known for it's cold winter.");
        } else if (region.equalsIgnoreCase("New York")) {
            System.out.println("New York is famous for the Statue of Liberty and Times Square.");
        } else if (region.equalsIgnoreCase("Texas")) {
            System.out.println("Texas is known for its BBQ and cowboy culture.");
        } else {
            System.out.println("I don't know anything about " + region);
        }
    }
}
