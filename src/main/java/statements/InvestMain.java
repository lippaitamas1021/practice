package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetett tőke összege: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kamatláb mértéke: ");
        int interestRate = scanner.nextInt();
        scanner.nextLine();

        Investment investment = new Investment(amount, interestRate);

        System.out.println("Befektetés összege: " + investment.getAmount() + " Ft");
        System.out.println("Hozam összege 50 napra: " + investment.getYield(50) + " Ft");
        System.out.println("Kifizetett összeg 60 nap után: " + investment.close(60) + " Ft");
        System.out.println("Kifizetett összeg 70 nap után: " + investment.close(70) + " Ft");
    }
}
