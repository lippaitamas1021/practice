package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private  List<Integer> numbers = new ArrayList<>();

    public List<Integer> readFromFile(String fileName) {
        Path path = Path.of(fileName);
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                for (int i = 0; i < temp.length; i++) {
                    int number = Integer.parseInt(temp[i]);
                    numbers.add(number);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        System.out.println(numbers);
        return numbers;
    }

    public int findSmallestOne() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        List<Integer> numbers2 = new ArrayList<>(numbers);
        Collections.sort(numbers2);
        if (numbers2.get(0) != numbers2.get(1)) {
            return numbers2.get(0);
        }
        for (int i = 1; i < numbers2.size() - 1; i++) {
            if (numbers2.get(i-1) != numbers2.get(i) && numbers2.get(i+1) != numbers2.get(i)) {
                return numbers2.get(i);
            }
        }
        if (numbers2.get(numbers2.size() - 1) != numbers2.get(numbers2.size() - 2)) {
            return numbers2.get(numbers2.size() - 1);
        }
        throw new IllegalStateException("Wrong list");
    }

    public static void main(String[] args) {
        NumberStat numberStat = new NumberStat();
        System.out.println(numberStat.readFromFile("numberstat.txt"));
        System.out.println(numberStat.findSmallestOne());
    }
}
