package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bands = new ArrayList<>();

    public void readBandsFromFile(Path inputFile) {
        try  (BufferedReader br = Files.newBufferedReader(inputFile)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                Band band = new Band(temp[0], Integer.parseInt(temp[1]));
                bands.add(band);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }

    private List<Band> selected(int year) {
        List<Band> selectedBands = new ArrayList<>();
        for (Band band : bands) {
            if (band.getYear() < year) {
                selectedBands.add(band);
            }
        } return selectedBands;
    }

    public void writeBandsBefore(Path outputFile, int year) {
        try (BufferedWriter bw = Files.newBufferedWriter(outputFile)) {
            for (Band band : selected(year)) {
                bw.write(band.getName() + " " + band.getYear() + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write the file", ioe);
        }
    }

    public static void main(String[] args) {
        BandManager bm = new BandManager();
        bm.readBandsFromFile(Path.of("src/main/resources/bands_and_years.txt"));
        bm.writeBandsBefore(Path.of("bands.txt"), 1978);
    }
}
