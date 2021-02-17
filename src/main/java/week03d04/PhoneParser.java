package week03d04;

import java.util.Scanner;

public class PhoneParser {

    public String parse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy telefonszámot a következő formátumban: 01-2345678");
        String together = scanner.nextLine();
        String[] temp = together.split("-");
        String prefix = temp[0];
        String number = temp[1];
        return new Phone(prefix, number).toString();
    }

    public static void main(String[] args) {
        PhoneParser pp = new PhoneParser();
        System.out.println(pp.parse());
    }
}
