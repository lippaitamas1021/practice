package exam0202;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySelectorTest {

    @Test
    public void selectEvens() {
        assertEquals("", new exam0202.ArraySelector().selectEvens(new int[]{}));
        assertEquals("[1]", new exam0202.ArraySelector().selectEvens(new int[]{1}));
        assertEquals("[1]", new exam0202.ArraySelector().selectEvens(new int[]{1, 2}));
        assertEquals("[1, 3]", new exam0202.ArraySelector().selectEvens(new int[]{1, 2, 3}));
        assertEquals("[1, 3]", new exam0202.ArraySelector().selectEvens(new int[]{1, 2, 3, 4}));
        assertEquals("[1, 3, 5]", new ArraySelector().selectEvens(new int[]{1, 2, 3, 4, 5}));
    }
}
