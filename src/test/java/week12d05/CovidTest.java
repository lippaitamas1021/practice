package week12d05;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

public class CovidTest {

    @Test
    void wordCounterTest() {
        Path file = Path.of("index.html");
        Covid covid = new Covid();
        int counter = covid.wordCounter("koronavírus", file);
        assertEquals(11, counter);
        int counter2 = covid.wordCounter("covid", file);
        assertEquals(6, counter2);
    }
}
