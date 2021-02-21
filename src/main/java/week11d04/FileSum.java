package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            String fileName = "number" + (i < 10 ? "0" + i : i) + ".txt";
            //System.out.println(fileName);
            if (Files.isRegularFile(Path.of(fileName))) {
                int number = readFile(fileName);
                sum += number;
            }
        }
        return sum;
    }

    public int readFile(String name) {
        Path path = Path.of(name);
        try {
            String content = Files.readString(path);
            int number = Integer.parseInt(content);
            return number;
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read the file");
        }
    }

    public static void main(String[] args) {
        //System.out.println(Files.isRegularFile(Path.of("number20.txt")));
        //System.out.println(Files.isRegularFile(Path.of("number21.txt")));
        System.out.println(new FileSum().sumNumbers());
    }
}
