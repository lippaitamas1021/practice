package week10d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public int findMinSum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        List<Integer> numbers = new ArrayList<>();
        for (int number : arr) {
            numbers.add(number);
        }
        Collections.sort(numbers);
        //System.out.println(numbers);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.findMinSum(new int[]{1, 2, 3, 4, 5, 6}));
    }
}
