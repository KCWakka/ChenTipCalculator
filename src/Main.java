import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = Scanner(System.in);
        System.out.println("Welcome to the tip Calculator!");
        System.out.println("How many people are in your group?: ");
        int peopleNum = scan.nextInt();
        scan.nextLine();
        System.out.println("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();

        }
}