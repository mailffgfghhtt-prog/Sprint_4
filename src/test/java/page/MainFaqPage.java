package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.logging.Logger;

public class MainFaqPage {
    private static final Logger LOGGER = Logger.getLogger(MainFaqPage.class.getName());
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;
    private By btnCookie = By.className("App_CookieButton__3cvqF");
    private String accordionId;
    private String expectedText;

    public MainFaqPage(WebDriver driver, String accordionId, String expectedText) {
        this.driver = driver;
        this.accordionId = accordionId;
        this.expectedText = expectedText;
    }

    public void getPage() {
        driver.get(URL);
        LOGGER.info("Открыта страница: " + URL);
    }

    public void clickCookie() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnCookie)).click();
        LOGGER.info("кнопка куки");
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        LOGGER.info("прокрутка вниз страницы");
    }

    public void openAccordion() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String panelId = "accordion__panel-" + accordionId.substring(accordionId.lastIndexOf("-") + 1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(accordionId))).click();
        LOGGER.info("открыт faq c id: " + accordionId);
    }

    public String getTextByAccordionId() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String panelId = "accordion__panel-" + accordionId.substring(accordionId.lastIndexOf("-") + 1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(panelId)));
        String text = driver.findElement(By.id(panelId)).getText();
        LOGGER.info("получаем текст ответа " + panelId + ": " + text);
        return text;
    }

    public static String question_8() {
        return "accordion__heading-7";
    }

    public static String question_7() {
        return "accordion__heading-6";
    }

    public static String question_6() {
        return "accordion__heading-5";
    }

    public static String question_5() {
        return "accordion__heading-4";
    }

    public static String question_4() {
        return "accordion__heading-3";
    }

    public static String question_3() {
        return "accordion__heading-2";
    }

    public static String question_2() {
        return "accordion__heading-1";
    }

    public static String question_1() {
        return "accordion__heading-0";
    }
}
