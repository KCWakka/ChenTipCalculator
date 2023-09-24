import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip Calculator!");
        System.out.print("What is your total income in dollars and cents per day?: ");
        double incomeNum = scan.nextDouble();
        scan.nextLine();
        System.out.print("How many people are in your group?: ");
        int peopleNum = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (put -1 to end): ");
        double itemCost = scan.nextDouble();
        scan.nextLine();
        double totalItemCost = itemCost;
        while (itemCost * 1 >= 0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (put -1 to end): ");
            itemCost = scan.nextDouble();
            scan.nextLine();
            if (itemCost != -1) {
                totalItemCost += itemCost;

            } else {
                totalItemCost += itemCost;
                totalItemCost++;
            }

        }
        System.out.println("--------------------");
        System.out.println("Total bill before tip: $" + totalItemCost);
        System.out.println("Total Percentage: " + tipPercent + "%");
        double tipCost = Math.round ( (totalItemCost * (tipPercent / 100.0)) * 100 ) / 100.0;
        System.out.println("Total tip: $" + tipCost);
        double totalCost = tipCost + totalItemCost;
        System.out.println("Total bill with tip: $" + totalCost);
        System.out.println("Per person cost before the tip: $" + Math.round (totalItemCost / peopleNum * 100) / 100.0);
        System.out.println("Tip per person : $" + Math.round (tipCost / peopleNum * 100) / 100.0);
        System.out.println("Total cost per person: $" + Math.round (totalCost / peopleNum * 100) / 100.0);
        System.out.println("You can get a meal like this approximately every" + Math.round (totalCost / incomeNum + 0.5));
        System.out.println("--------------------");
    }
}