package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy időpontot!");
        System.out.println("Óra: ");
        int hour1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Perc: ");
        int min1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Másodperc: ");
        int sec1 = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Kérem, adjon meg egy másik időpontot!");
        System.out.println("Óra: ");
        int hour2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Perc: ");
        int min2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Másodperc: ");
        int sec2 = scanner.nextInt();
        scanner.nextLine();

        Time time1 = new Time(hour1, min1, sec1);
        Time time2 = new Time(hour2, min2, sec2);

        System.out.println("Az első " + time1.toString() + " = " + time1.getInMinutes() + " perc");

        System.out.println("A második " + time2.toString() + " = " + time2.getInSeconds() + " másodperc");

        System.out.println("Az első időpont korábbi, mint a második? " + time1.earlierThan(time2));
    }
}
