package week10d01;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> heights) {
        if (heights.isEmpty() || heights.size() == 1) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < heights.size(); i = i + 2) {
            sum += heights.get(i + 1) - heights.get(i);
        }
        return sum;
    }
}
