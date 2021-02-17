package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public void guessTheNumber() {
        Random random = new Random();
        int r = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Kérem, tippeljen, melyik számra gondoltam");
            int number1 = scanner.nextInt();
            scanner.nextLine();
            if (number1 < r) {
                System.out.println("Az általam gondolt szám nagyobb");
            }
            if (r < number1) {
                System.out.println("Az általam gondolt szám kisebb");
            }
            if (number1 == r) {
                System.out.println("Gratulálok, Ön eltalálta a számot!");
            }
        }
        System.out.println(r);
    }

    public static void main(String[] args) {
        GuessTheNumber gtn = new GuessTheNumber();
        gtn.guessTheNumber();
    }
}
