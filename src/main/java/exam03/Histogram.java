package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public static final String REPLACE_CHAR = "*";

    public String createHistogram(BufferedReader reader) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(convertToStars(number));
                stringBuilder.append(convertToStars(Integer.parseInt(line)));
                stringBuilder.append("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Failed at reading the file", ioe);
        }
        return stringBuilder.toString();
    }

    private String convertToStars(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append('*');
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Histogram histogram = new Histogram();
        System.out.println(histogram.createHistogram((Files.newBufferedReader(Path.of("histogram.txt")))));
    }
}
