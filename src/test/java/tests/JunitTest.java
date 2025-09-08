package tests;

import org.junit.jupiter.api.Test;
import pages.JunitPage;


public class JunitTest  extends TestBase{

    private JunitPage junitPage = new JunitPage();

    @Test
    void junitPageTest() {
        junitPage.openMainPage();
        junitPage.clickUserGuide();
        junitPage.verifyUserGuideTitle();

    }
}