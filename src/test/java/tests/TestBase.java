package tests;

import config.WebDriverProvider;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeEach
    void setUp() {
        WebDriverProvider.configure();
    }
}
