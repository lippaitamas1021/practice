package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy számot!");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num > 100) {
            System.out.println("Nagyobb, mint 100!");
        } else {
            System.out.println("100 vagy annál kisebb!");
        }
    }
}
