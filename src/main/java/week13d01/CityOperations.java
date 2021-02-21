package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CityOperations {

    public String findCityWithMaxLength(BufferedReader bufferedReader) {
        List<String> cities = new ArrayList<>();
        String cityWithMaxLength = null;
        try {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(";");
                String postCode = temp[0];
                String cityName = temp[1];
                cities.add(cityName);
                int counter = 0;
                for (String city : cities) {
                    if (counter < city.length()) {
                        counter = city.length();
                        cityWithMaxLength = city;
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read the file", e);
        }
        return cityWithMaxLength;
    }

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Path.of("iranyitoszamok.txt"));
            System.out.println(new CityOperations().findCityWithMaxLength(bufferedReader));
        } catch (IOException e) {
            throw new IllegalStateException("Can not read the file", e);
        }

    }
}
