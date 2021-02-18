package week07d02;

public class DigitSum {

    public int sumOfDigits(int number) {
        String s = String.valueOf(number);
        String[] temp = s.split("");
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
