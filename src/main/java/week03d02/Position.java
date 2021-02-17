package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position: " + "name = " + name + ", bonus=" + bonus + '}' + "\n";
    }

    private List<Position> sorter(List<Position> positions) {
        List<Position> sorted = new ArrayList<>();
        for (int i = 0; i < positions.size(); i++) {
            if (150_000 < positions.get(i).getBonus()) {
                sorted.add(positions.get(i));
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        List<Position> positions = new ArrayList<>();
        Position pos = new Position("administrator", 140_000);
        positions.add(new Position("manager", 500_000));
        positions.add(new Position("officer", 200_000));
        positions.add(new Position("controller", 300_000));
        positions.add(new Position("physical worker", 100_000));
        System.out.println(pos.sorter(positions));
    }
}
