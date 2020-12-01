package introcontrol;

import java.util.Scanner;

public class BoatRental {
    int boat1Capacity = 5;
    int boat2Capacity = 3;
    int boat3Capacity = 2;

    public static void main(String[] args) {
        System.out.println("Hány fős csoport érkezett?");
        Scanner scanner = new Scanner(System.in);
        int numberOfGroup = scanner.nextInt();
        scanner.nextLine();

        int freePlaces = 10;
        int freeBoats = 3;

        if (numberOfGroup > 3) {
            System.out.println("Ötfős csónak");
            numberOfGroup -= 5;
            freeBoats--;
            freePlaces -=5;
        }

        if (numberOfGroup > 2) {
            System.out.println("Háromfős csónak");
            numberOfGroup -= 3;
            freeBoats--;
            freePlaces -=3;
        }

        if (numberOfGroup > 0) {
            System.out.println("Kétfős csónak");
            numberOfGroup -=2;
            freeBoats--;
            freePlaces -=2;
        }

        if (numberOfGroup > 0) {
            System.out.println("Nem fér el mindenki a csónakban!");
        } else {
            System.out.println("Szabad helyek száma: " + freePlaces);
            System.out.println("Szabad csónakok száma:" + freeBoats);
        }
    }
}
