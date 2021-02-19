package week11d01;

import java.util.Arrays;

public class DivisorFinder {

    public int findDivisors(int number) {
        String numberInString = String.valueOf(number);
        int counter = 0;
        for (char c : numberInString.toCharArray()) {
            if (number % Integer.parseInt(String.valueOf(c)) == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        DivisorFinder df = new DivisorFinder();
        System.out.println(df.findDivisors(425));
    }
}
