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
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public abstract class baseTest {
    protected WebDriver driver;
    protected String browserType;
    protected WebDriverWait wait;
    protected FormMainPage formMainPage;
    protected FaqMainPage faqMainPage;
    public baseTest(String browserType) {
        this.browserType = browserType;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"chrome"},
                {"firefox"}
        });
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
}