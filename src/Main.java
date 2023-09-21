import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        double percentage = scan.nextDouble();
        double total = 0;
        double cost = 0;
        String item = "";
        String item2 = "";
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            if (cost != -1) {
                scan.nextLine();
                System.out.print("Enter the item: ");
                item2 = scan.nextLine();
                item = item + " " + item2;
                total += cost;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage: " + percentage + "%");
        System.out.println("Total tip: $");
        System.out.println("Total bill with tip: $");
        System.out.println("Per person per cost before tip: $";
        System.out.println("Tip per person: $");
        System.out.println("Total cost per person: $");
        System.out.println("---------------------------------");
        System.out.println("Items ordered: ");
        System.out.println(item);
    }
}