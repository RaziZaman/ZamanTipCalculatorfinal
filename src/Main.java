import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How much money are you able to spend today? ");
        double budget = scan.nextInt();
        double total = 0.0;
        double tip = 0.0;
            System.out.println("Welcome to the tip calculator!");
            System.out.print("How many people are in your group: ");
            //amount of people
            int people = scan.nextInt();
            System.out.print("What's the tip percentage? (0-100): ");
            //tip percentage
            double percentage = scan.nextDouble();
            percentage *= 0.01;
            total = 0.0;
            double cost = 0.0;
            String item = "";
            String item2 = "";
            //loop for each item
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
            String tipFinal;
            String totalPercentageFinal;
            String billTipFinal;
            String perPersonBeforeTipFinal;
            String tipPerPersonFinal;
            String totalCostPerPersonFinal;
            String totalFinal;
            //calculations
            tip = (((int) ((percentage * total) * 100.0)) / 100.0);
            double totalPercentage = (percentage * 100);
            double billTip = total + tip;
            double perPersonBeforeTip = (((int) ((total / people) * 100.0)) / 100.0);
            double tipPerPerson =  (((int) ((tip / people) * 100.0)) / 100.0);
            double totalCostPerPerson = (((int) (((total + tip) / people) * 100.0)) / 100.0);
        //Formating to the hundreths place
        if (tip % 0.1 > 0) {
            tipFinal = tip + "0";
        } else {
            tipFinal = tip + "";
        }
        if (total % 0.1 > 0) {
            totalFinal = total + "0";
        } else {
            totalFinal = total + "";
        }
        if (totalPercentage % 0.1 > 0) {
            totalPercentageFinal = totalPercentage + "0";
        } else {
            totalPercentageFinal = totalPercentage + "";
        }
        if (billTip % 0.1 > 0) {
            billTipFinal = billTip + "0";
        } else {
            billTipFinal = billTip + "";
        }
        if (perPersonBeforeTip % 0.1 > 0) {
            perPersonBeforeTipFinal = perPersonBeforeTip + "0";
        } else {
            perPersonBeforeTipFinal = perPersonBeforeTip + "";
        }
        if (tipPerPerson % 0.1 > 0) {
            tipPerPersonFinal = tipPerPerson + "0";
        } else {
            tipPerPersonFinal = tipPerPerson + "";
        }
        if (totalCostPerPerson % 0.1 > 0) {
            totalCostPerPersonFinal = totalCostPerPerson + "0";
        } else {
            totalCostPerPersonFinal = totalCostPerPerson + "";
        }
        //ending
            if ((total + tip) <= budget) {
                System.out.println(tip);
                System.out.println("---------------------------------");
                System.out.println("Total bill before tip: $" + totalFinal);
                System.out.println("Total percentage: " + totalPercentageFinal + "%");
                System.out.println("Total tip: $" + tipFinal);
                System.out.println("Total bill with tip: $" + billTipFinal);
                System.out.println("Per person per cost before tip: $" + perPersonBeforeTipFinal);
                System.out.println("Tip per person: $" + tipPerPersonFinal);
                System.out.println("Total cost per person: $" + totalCostPerPersonFinal);
                System.out.println("---------------------------------");
                System.out.println("Items ordered: ");
                System.out.println(item);
            } else {
                System.out.println("You went over your budget, your total was " + (total + tip) + ", please try again.");
            }
    }
}