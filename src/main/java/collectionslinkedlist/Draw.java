package collectionslinkedlist;

import java.util.*;

public class Draw {

    private List<Integer> createBallPool(int balls){
        List<Integer> ballPool = new ArrayList<>();
        for (int i = 1; i <= balls; i++) {
            ballPool.add(i);
        }
        Collections.shuffle(ballPool);
        return ballPool;
    }

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) {
        if (drawCount >= maxNumber) {
            throw new IllegalArgumentException("Wrong parameters");
        }
        return new TreeSet<>(createBallPool(maxNumber));
    }
}
