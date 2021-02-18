package week08d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers() {
        Random random = new Random();
        List<Integer> result = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(90) + 1;
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers());
    }
}
