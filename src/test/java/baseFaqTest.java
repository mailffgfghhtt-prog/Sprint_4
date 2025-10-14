import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.MainFaqPage;

import java.time.Duration;

@RunWith(Parameterized.class)
public class baseFaqTest {
    MainFaqPage mainFaqPage;
    private WebDriver driver;
    private WebDriverWait wait;
    private String accordionId;
    private String expectedText;

    public baseFaqTest(String accordionId, String expectedText) {
        this.accordionId = accordionId;
        this.expectedText = expectedText;
    }

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        mainFaqPage = new MainFaqPage(driver, accordionId, expectedText);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
