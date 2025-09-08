package tests;

import com.codeborne.selenide.Configuration;
import config.WebDriverProvider;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;


public class TestBase {

    @BeforeEach
    void setUp() {
        WebDriverProvider.configure();
    }
}
