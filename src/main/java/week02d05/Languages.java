package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");

        for (int i = 0; i < languages.size(); i++) {
            if (5 < languages.get(i).length()) {
                System.out.println(languages.get(i));
            }
        }
    }
}
