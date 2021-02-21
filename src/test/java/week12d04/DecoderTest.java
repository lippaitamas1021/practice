package week12d04;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DecoderTest {

    @Test
    public void decodeTest() {
        Decoder decoder = new Decoder();
        Exception exception = assertThrows(IllegalStateException.class, () -> decoder.printSecret(Path.of("secret2.dat")));
        assertEquals("Can not decode file", exception.getMessage());
    }
}

