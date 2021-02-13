package collectionslinkedlist;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class DrawTest {

    @Test
    public void wrongParametersShouldThrowExeption() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Draw().drawNumbers(8, 8);
        });
        assertEquals("Wrong parameters", ex.getMessage());
    }

    @Test
    public void drawnNumbersCountShouldBeEqualToDrawCount() throws IllegalArgumentException {
        int drawCount = 5;
        int maxNumber = 90;
        Set<Integer> drawnNumbers = new Draw().drawNumbers(drawCount, maxNumber);
        // assertThat(drawnNumbers.size(), equalTo(drawCount));
        for (int drawnNumber : drawnNumbers) {
            assertTrue(drawnNumber > 0);
            assertTrue(drawnNumber <= maxNumber);
        }
    }
}
