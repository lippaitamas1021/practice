package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Covid {

    public int wordCounter(String word, Path file) {
        int counter = 0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read the file", e);
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new Covid().wordCounter("koronavírus", Path.of("index.html")));
        System.out.println(new Covid().wordCounter("covid", Path.of("index.html")));
    }
}
