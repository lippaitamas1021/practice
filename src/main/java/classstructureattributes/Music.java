package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Song song = new Song();

        System.out.println("Kérem, adja meg a kedvenc előadóját:");
        song.band = scanner.nextLine();

        System.out.println("Kérem, adja meg a kedvenc dalának címét:");
        song.title = scanner.nextLine();

        System.out.println("Kérem, adja meg a dal hosszát percben:");
        song.length = scanner.nextInt();
        scanner.nextLine();

        System.out.println(
                song.band + " - " + song.title + " (" + song.length + " perc)"
        );
    }
}
