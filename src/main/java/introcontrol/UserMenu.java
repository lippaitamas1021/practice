package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        System.out.println("Menü: \n1. Felhasználók listázzása \n2. Felhasználó felvétele \nTöbbi: Kilépés ");

        System.out.println("Kérem, adja meg a választott menü számát:");

        Scanner scanner = new Scanner(System.in);
        int menuChoosen = scanner.nextInt();
        scanner.nextLine();

        if (menuChoosen == 1) {
            System.out.println("Felhasználók listázása");
        } else if (menuChoosen == 2) {
            System.out.println("Felhasználó felvétele:");
        }
        }
    }

