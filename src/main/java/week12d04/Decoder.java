package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Decoder {

    public String printSecret(Path path) {
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b : bytes) {
                char c = (char) (b + 10);
                sb.append(c);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not decode file", ioe);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = new Decoder().printSecret(Path.of("secret.dat"));
        System.out.println(result);
    }
}
