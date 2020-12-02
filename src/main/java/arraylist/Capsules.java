package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capsules {

    private List<String> colors = new ArrayList<>();

    public void addLast(String color) {

        colors.add(color);
    }

    public void addFirst(String color) {

        colors.add(color);
    }

    public void removeFirst() {

        colors.remove(0);
    }

    public void removeLast() {

        colors.remove(colors.size() - 1);
    }

    public List<String> getColors() {

        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addFirst("Red");
        capsules.addFirst("Green");
        capsules.addFirst("Blue");
        System.out.println(capsules.getColors());

        capsules.addLast("Black");
        capsules.addLast("Grey");
        capsules.addLast("Brown");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        System.out.println(capsules.getColors());

        capsules.removeLast();
        System.out.println(capsules.getColors());

    }
}
