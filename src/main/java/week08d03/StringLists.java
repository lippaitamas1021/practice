package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        for (String s1 : first) {
            if (!result.contains(s1)) {
                result.add(s1);
            }
        }
        for (String s2 : second) {
            if (!result.contains(s2)) {
                result.add(s2);
            }
        }
        return result;
    }
}
