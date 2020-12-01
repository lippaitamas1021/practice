package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("Kérem, adjon meg 5 számot! \n Első szám:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Második szám:");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Harmadik szám:");
        int num3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Negyedik szám:");
        int num4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ötödik szám:");
        int num5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(num1 + num2 + num3 + num4 + num5);

    }
}
