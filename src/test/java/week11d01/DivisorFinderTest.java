package week11d01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisorFinderTest {

    @Test
    void findDivisors() {
        assertEquals(1, new DivisorFinder().findDivisors(425));
    }
}
