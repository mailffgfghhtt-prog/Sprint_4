package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageAH {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;
    private By AH1 = By.id("accordion__heading-0");
    private By AH2 = By.id("accordion__heading-1");
    private By AH3 = By.id("accordion__heading-2");
    private By AH4 = By.id("accordion__heading-3");
    private By AH5 = By.id("accordion__heading-4");
    private By AH6 = By.id("accordion__heading-5");
    private By AH7 = By.id("accordion__heading-6");
    private By AH8 = By.id("accordion__heading-7");
    private By Cookie = By.id("rcc-confirm-button");



    public MainPageAH(WebDriver driver) {
        this.driver = driver;
    }
    public void checkAH8() {
        boolean flag;
        driver.findElement(AH8).click();
        flag = driver.getPageSource().contains("Да, обязательно. Всем самокатов! И Москве, и Московской области.");
        System.out.println("Текст найден: " + flag);
    }

    public void checkAH7() {
        boolean flag;
        driver.findElement(AH7).click();
        flag = driver.getPageSource().contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
        System.out.println("Текст найден: " + flag);
    }

    public void checkAH6() {
        boolean flag;
        driver.findElement(AH6).click();
        flag = driver.getPageSource().contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
        System.out.println("Текст найден: " + flag);
    }

    public void checkAH5() {
        boolean flag;
        driver.findElement(AH5).click();
        flag = driver.getPageSource().contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
        System.out.println("Текст найден: " + flag);
    }

    public void checkAH4() {
        boolean flag;
        driver.findElement(AH4).click();
        flag = driver.getPageSource().contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
        System.out.println("Текст найден: " + flag);
    }

    public void checkAH3() {
        boolean flag;
        driver.findElement(AH3).click();
        flag = driver.getPageSource().contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
        System.out.println("Текст найден: " + flag);
    }

    public void checkAH2() {
        boolean flag;
        driver.findElement(AH2).click();
        flag = driver.getPageSource().contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
        System.out.println("Текст найден: " + flag);
    }

    public void checkAH1() {
        driver.findElement(AH1).click();
        boolean flag = driver.getPageSource().contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
        System.out.println("Текст найден: " + flag);
    }

    public void clickCookie() {
        driver.findElement(Cookie).click();
    }

    public void scrollDown() {
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void getPage() {
        driver.get(URL);
    }
}
