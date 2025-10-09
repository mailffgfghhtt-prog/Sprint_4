import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ChromeTest extends baseTest{

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }
    @Test
    public void chromeFormsTest() {
                minePage.getPage();
                minePage.clickBtnUp();
                minePage.inputName("Аркадий");
                minePage.inputFirstName("Гайдай");
                minePage.inputAdress("центральная");
                minePage.inputNumber("+79885886633");
                minePage.checkStation();
                minePage.clickBtnNext();
                minePage.inputDeliveryDate("21.12.2025");
                minePage.clickRentalPeriod();
                minePage.checkRentalPeriod();
                minePage.chekingcollor();
                minePage.inputComment("домофон не работает");
                minePage.clickBtnY();
                minePage.clickBtnOk();
                minePage.chekingText();
            }
        }