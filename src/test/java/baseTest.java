import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import page.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class baseTest {
    WebDriver driver;
    WebDriverWait wait;
    MainPage minePage;
    private String browser;


    public baseTest() {

    }


    public baseTest(String browser) {
        this.browser = browser;
    }

    @Before
    public void setUp() {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный браузер: " + browser);
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        minePage = new MainPage(driver);

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"chrome"},
                {"firefox"}
        });
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}