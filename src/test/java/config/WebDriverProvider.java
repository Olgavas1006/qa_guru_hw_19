package config;

import org.aeonbits.owner.ConfigFactory;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Map;

public class WebDriverProvider {

    public static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configure() {
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.baseUrl = config.getBaseUrl();

        System.out.println("Browser: " + config.getBrowser());
        System.out.println("Browser version: " + config.getBrowserVersion());
        System.out.println("Is remote: " + config.isRemote());

        if (config.isRemote() && config.getRemoteUrl() != null) {
            setupRemoteDriver();
        } else {
            System.out.println("Local driver configuration");
        }
    }

    private static void setupRemoteDriver() {
        Configuration.remote = config.getRemoteUrl();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;

        System.out.println("Remote URL: " + config.getRemoteUrl());
        System.out.println("Remote driver configured");
    }
}
