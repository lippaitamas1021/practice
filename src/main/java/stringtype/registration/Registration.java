package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a választott felhasználónevet: ");
        String userName = scanner.nextLine();

        System.out.println("Kérem, adja meg a választott jelszót: ");
        String password1 = scanner.nextLine();

        System.out.println("Kérem, adja meg újra a jelszót: ");
        String password2 = scanner.nextLine();

        System.out.println("Kérem, adja meg a választott e-mail címet: ");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();


        System.out.println(userValidator.isValidUsername(userName) ? "felhasználónév érvényes" : "felhasználónév érvénytelen");
        System.out.println(userValidator.isValidPassword(password1, password2) ? "jelszó érvényes" : "jelszó érvénytelen");
        System.out.println(userValidator.isValidEmail(email) ? "e-mail cím érvényes" : "e-mail cím érvénytelen");

    }
}
