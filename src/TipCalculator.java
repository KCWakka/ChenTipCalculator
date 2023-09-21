import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip Calculator!");
        System.out.print("What is your income in dollars and cents?: ");
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
        while (itemCost * 1 <= 0) {
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
        System.out.println("Total bill before tip: " + totalItemCost);
        System.out.println("Total Percentage: " + tipPercent + "%");
        System.out.println("Total tip: $" + (totalItemCost / (tipPercent / 100.0)));
    }
}