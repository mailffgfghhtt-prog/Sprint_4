package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import java.util.logging.Logger;

public class MainFaqPage {
    private static final Logger LOGGER = Logger.getLogger(MainFaqPage.class.getName());
    private WebDriver driver;
    private String accordionId;
    private String expectedText;


    public MainFaqPage(WebDriver driver, String accordionId, String expectedText) {
        this.driver = driver;
        this.accordionId = accordionId;
        this.expectedText = expectedText;
    }

    public void textNotFound(boolean flag) {
        Assert.assertTrue("Текст не найден", flag);
    }

    public void textFound(boolean flag) {
        LOGGER.info("Для " + accordionId + ": текст найден — " + flag);
    }

    public boolean textVerification() {
            driver.findElement(By.id(accordionId)).click();
            boolean flag = driver.getPageSource().contains(expectedText);
            return flag;
    }

    public void clickCookie() {
            driver.findElement(By.className("App_CookieButton__3cvqF")).click();

    }

    public void scrollDown() {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void getPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");;

    }

}
