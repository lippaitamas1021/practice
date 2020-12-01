package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] weekDays = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(weekDays[1]);
        System.out.println(weekDays.length);


        int[] arrayOfNumbers = new int[5];
        arrayOfNumbers[0] = 1;
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = arrayOfNumbers[i - 1] * 2;
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);
        }

        boolean[] b = new boolean[6];
            for (int i = 1; i < b.length; i++) {
                b[i] = !b[i - 1];
            }
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }
    }
}
