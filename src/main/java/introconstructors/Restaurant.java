package introconstructors;

import java.util.Arrays;
import java.util.List;

public class Restaurant {

    private List<String> menu;
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this. capacity = numberOfTables * 4;
        this.menu = generateMenu();
    }

    private List<String> generateMenu() {
        return Arrays.asList("Chicken tikka masala", "Fish and chips", "Apple pie");
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
