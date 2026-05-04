import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class PathTest {
    @Test
    public void testFilePathConfig() {
        String path = "target\\test-classes\\test.txt";
        File file = new File(path);

        assertEquals(true, file.exists());
    }
}