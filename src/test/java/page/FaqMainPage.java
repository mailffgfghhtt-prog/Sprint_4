package page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class FaqMainPage {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    public static final String a = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String b = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String c = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String d = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String e = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String f = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String g = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String h = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    WebDriver driver;
    private By cost = By.id("accordion__heading-0");
    private By tCost = By.id("accordion__panel-0");
    private By quantity = By.id("accordion__heading-1");
    private By tQuantity = By.id("accordion__panel-1");
    private By cookie = By.id("rcc-confirm-button");
    private By rentalTime = By.id("accordion__heading-2");
    private By tRentalTime = By.id("accordion__panel-2");
    private By today = By.id("accordion__heading-3");
    private By tToday = By.id("accordion__panel-3");
    private By extension = By.id("accordion__heading-4");
    private By tExtension = By.id("accordion__panel-4");
    private By charging = By.id("accordion__heading-5");
    private By tCharging = By.id("accordion__panel-5");
    private By cancellation = By.id("accordion__heading-6");
    private By tCancellation = By.id("accordion__panel-6");
    private By availability = By.id("accordion__heading-7");
    private By tAvailability = By.id("accordion__panel-7");
    public FaqMainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openPage() {
        driver.get(URL);
    }
    public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void checkCost() {
        String expectedText = a;
        String actualText = driver.findElement(tCost).getText();
        assert actualText.contains(expectedText);
    }
    public void clickCost() {
        driver.findElement(cost).click();
    }
    public void clickCookie() {
        driver.findElement(cookie).click();
    }
    public void checkQuantity() {
        String expectedText = b;
        String actualText = driver.findElement(tQuantity).getText();
        assert actualText.contains(expectedText);
    }
    public void clickQuantity() {
        driver.findElement(quantity).click();
    }
    public void checkRentalTime() {
        String expectedText = c;
        String actualText = driver.findElement(tRentalTime).getText();
        assert actualText.contains(expectedText);
    }
    public void clickRentalTime() {
        driver.findElement(rentalTime).click();
    }
    public void scroll() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void checkToday() {
        String expectedText = d;
        String actualText = driver.findElement(tToday).getText();
        assert actualText.contains(expectedText);
    }
    public void clickToday() {
        driver.findElement(today).click();
    }
    public void checkExtension() {
        String expectedText = e;
        String actualText = driver.findElement(tExtension).getText();
        assert actualText.contains(expectedText);
    }
    public void clickExtension() {
        driver.findElement(extension).click();
    }
    public void checkCharging() {
        String expectedText = f;
        String actualText = driver.findElement(tCharging).getText();
        assert actualText.contains(expectedText);
    }
    public void clickCharging() {
        driver.findElement(charging).click();
    }
    public void checkCancellation() {
        String expectedText = g;
        String actualText = driver.findElement(tCancellation).getText();
        assert actualText.contains(expectedText);
    }
    public void clickCancellation() {
        driver.findElement(cancellation).click();
    }
    public void checkAvailability() {
        String expectedText = h;
        String actualText = driver.findElement(tAvailability).getText();
        assert actualText.contains(expectedText);
    }
    public void clickAvailability() {
        driver.findElement(availability).click();
    }
}
