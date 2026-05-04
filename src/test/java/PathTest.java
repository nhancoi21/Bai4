package banksystem;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

public class PathTest {
    @Test
    public void testFilePathConfig() {
        Path path = Paths.get("target", "test-classes", "test.txt");
        File file = path.toFile();

        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("Path thực tế: " + file.getPath());

        assertNotNull(file.getParent(), "Thư mục cha phải tồn tại");

        assertTrue(file.getPath().contains(File.separator),
          "Đường dẫn phải chứa dấu: " + File.separator);
    }
}