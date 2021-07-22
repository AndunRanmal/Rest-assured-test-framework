package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;

public class ApiBaseTest {

    private static final Logger logger = LogManager.getLogger();

    @BeforeClass
    public void main() {
        logger.info("Start Api testing");
    }
}
