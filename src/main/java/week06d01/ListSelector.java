package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {

    public String listSelector(List<String> list) {
        if (list.size() == 0) {
            return " ";
        }
        if (list == null) {
            throw new IllegalArgumentException("The list is empty");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i = i+2) {
           sb.append(list.get(i) + " ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("alma");
        list.add("körte");
        list.add("meggy");
        list.add("ananász");
        list.add("barack");
        list.add("szilva");
        list.add("cseresznye");
        list.add("füge");

        ListSelector ls = new ListSelector();
        System.out.println(ls.listSelector(list));

        List<String> list2 = new ArrayList<>();
        System.out.println(ls.listSelector(list2));
    }
}
