import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public double add(double a, double b) {
        logger.info("Adding: {} + {}", a, b);
        return a + b;
    }

    public double subtract(double a, double b) {
        logger.info("Subtracting: {} - {}", a, b);
        return a - b;
    }
}