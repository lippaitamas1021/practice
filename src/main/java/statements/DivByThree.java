package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy egész számot 1 és 100 között:");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(number1 % 3 == 0 ? "Osztható 3-mal" : "Nem osztható 3-mal");

    }
}
