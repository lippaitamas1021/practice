package week10d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> integers) {
        return max(counter(integers));
    }

    public int[] counter(List<Integer> integers) {
        int[] counters = new int[30];
        for (Integer integer : integers) {
            counters[integer]++;
        }
        return counters;
    }

    public int max(int[] counters) {
        int index = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[index] < counters[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        MaxTravel maxTravel = new MaxTravel();
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 12, 0, 3, 4, 4, 12));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 9, 6, 13, 14, 14, 12, 2, 9, 14));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(2, 9, 6, 13, 9, 14, 12, 2, 9));

        System.out.println(maxTravel.getMaxIndex(list));
        System.out.println(maxTravel.getMaxIndex(list2));
        System.out.println(maxTravel.getMaxIndex(list3));
    }
}
