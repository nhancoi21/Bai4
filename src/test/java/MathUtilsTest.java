import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    private MathUtils utils;

    @BeforeEach
    void setUp() {
        utils = new MathUtils();
    }

    @Test
    void testAdd() {
        assertEquals(10.0, utils.add(7.0, 3.0));
        assertEquals(0.0, utils.add(-5.0, 5.0));
    }

    @Test
    void testSubtract() {
        assertEquals(4.0, utils.subtract(10.0, 6.0));
        assertEquals(-2.0, utils.subtract(3.0, 5.0));
    }
}