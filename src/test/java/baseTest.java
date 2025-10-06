import Page.MainPage;
import Page.MainPageAH;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class baseTest {
    WebDriver driver;
    WebDriverWait wait;
    MainPage minePage;
    MainPageAH mainPageAH;


    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        minePage = new MainPage(driver);
        mainPageAH = new MainPageAH(driver);
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}