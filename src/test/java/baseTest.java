import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.FaqMainPage;
import page.FormMainPage;
import java.time.Duration;
@RunWith(Parameterized.class)
public abstract class baseTest {
    protected WebDriver driver;
    protected String browserType;
    public WebDriverWait wait;
    FormMainPage formMainPage;
    FaqMainPage faqMainPage;
    public baseTest(String browserType) {
        this.browserType = browserType;
    }
    @Before
    public void setUp() {
        if ("chrome".equals(browserType)) {
            driver = new ChromeDriver();
        } else if ("firefox".equals(browserType)) {
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Неизвестный тип браузера: " + browserType);
        }
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        formMainPage = new FormMainPage(driver);
        faqMainPage = new FaqMainPage(driver);
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"firefox"},
                {"chrome"}
        };
    }
}