package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy egész számot!");
        int numOne = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem, adjon meg egy másik egész számot!");
        int numTwo = scanner.nextInt();
        scanner.nextLine();

        System.out.println(numOne + "+" + numTwo);

        System.out.println(numOne + numTwo);

    }
}
