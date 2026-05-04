package banksystem;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

public class PathTest {
    @Test
    public void testFilePathFailure() {
        String wrongPath = "src\\test\\java\\banksystem\\PathTest.java";
        File file = new File(wrongPath);

        System.out.println("Checking path on " + System.getProperty("os.name") + ": " + wrongPath);

        assertTrue(file.exists(), "Lỗi: Không tìm thấy file trên hệ điều hành này!");
    }
}