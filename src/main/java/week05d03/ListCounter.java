package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    public Integer listCounter(List<String> list) {
        String s1 = "a";
        String s2 = "A";
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(s1) || list.get(i).startsWith(s2)) {
                counter++;
            }
        }
        if (list.size() == 0 || counter == 0) {
            return null;
        }
        return counter;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("almafa", "Akácfa", "hársfa"));
        ListCounter lc = new ListCounter();
        System.out.println(lc.listCounter(list));
    }
}
