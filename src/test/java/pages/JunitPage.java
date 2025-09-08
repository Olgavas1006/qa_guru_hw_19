package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JunitPage {
    private final SelenideElement userGuideLink = $("a[href*='user-guide']"),
                  pageTitle = $("h1");

    public void openMainPage() {
        open("/");
    }
    public void clickUserGuide() {
        userGuideLink.click();
    }
    public void verifyUserGuideTitle() {
        pageTitle.shouldHave(text("JUnit 5 User Guide"));
    }
}
