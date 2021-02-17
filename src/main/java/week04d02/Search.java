package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String word, char character) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (character == word.charAt(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Search search = new Search();
        System.out.println(search.getIndexesOfChar("almafa", 'a'));
    }
}
