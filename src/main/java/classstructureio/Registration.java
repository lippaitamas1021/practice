package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem, adja meg az email címét:");
        String email = scanner.nextLine();

        System.out.println("Regisztrációs adatok: Név: " + name + ", E-mail cím: " + email );
    }
}
