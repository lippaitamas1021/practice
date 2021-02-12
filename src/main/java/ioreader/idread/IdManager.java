package ioreader.idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    private List<String> ids = new ArrayList<>();

    public List<String> getIds() {
        return new ArrayList<>(ids);
    }

    public void readIdsFromFile(String fileName) {
        try {
            BufferedReader br = Files.newBufferedReader(Path.of(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                ids.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }

    public static void main(String[] args) {
        IdManager idManager = new IdManager();
        idManager.readIdsFromFile("idnumbers.txt");
    }
}
