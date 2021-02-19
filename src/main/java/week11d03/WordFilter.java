package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {


    public List<String> wordsWithChar(List<String> list1, char c) {
        List<String> result = new ArrayList<>();
        for (String s : list1) {
            if (s.contains(String.valueOf(c))) {
                result.add(s);
            }
        }
        return result;
    }
}
