import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        double percentage = scan.nextDouble();
        percentage *= 0.01;
        double total = 0.0;
        double cost = 0.0;
        String item = "";
        String item2 = "";
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            if (cost != -1) {
                scan.nextLine();
                System.out.print("Enter the item: ");
                item2 = scan.nextLine();
                if (item == "") {
                    item = item2;
                } else {
                    item = item + "\n" + item2;
                }
                total += cost;
            }
        }
        double tip = (((int) ((percentage * total) * 100.0)) / 100.0);
        System.out.println(tip);
        System.out.println("---------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage: " + (percentage * 100) + "%");
        System.out.println("Total tip: $" + tip);
        System.out.println("Total bill with tip: $" + (total + tip));
        System.out.println("Per person per cost before tip: $" + (((int) ((total / people) * 100.0)) / 100.0));
        System.out.println("Tip per person: $" + (((int) ((tip / people) * 100.0)) / 100.0));
        System.out.println("Total cost per person: $" + (((int) (((total + tip) / people) * 100.0)) / 100.0));
        System.out.println("---------------------------------");
        System.out.println("Items ordered: ");
        System.out.println(item);
    }
}