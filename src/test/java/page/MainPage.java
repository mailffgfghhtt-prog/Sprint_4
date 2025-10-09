package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.Keys.ENTER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertTrue;

public class MainPage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;
    private By btnOk = By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)");
    private By btnY = By.cssSelector("button.Button_Middle__1CSJM:nth-child(2)");
    private  By comment = By.cssSelector("input[placeholder='Комментарий для курьера']");
    private By CRentalPeriod = By.cssSelector(".Dropdown-arrow");
    private By collor = By.xpath("//*[@id=\"black\"]");
    private By deliveryDate = By.cssSelector("input[placeholder='* Когда привезти самокат']");
    private By rentalPeriod = By.cssSelector("div.Dropdown-option:nth-child(2)");
    private By btnNext = By.className("Button_Middle__1CSJM");
    private By station = By.cssSelector("input[placeholder='* Станция метро']");
    private By number = By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']");
    private By adress = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");
    private By firstName = By.cssSelector("input[placeholder='* Фамилия']");
    private By name = By.cssSelector("input[placeholder='* Имя']");
    private By btnUp = By.className("Button_Button__ra12g");
    private By btnDown = By.cssSelector(".Button_Middle__1CSJM");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void getPage() {
        driver.get(URL);
    }
    public void chekingText() {
        boolean flag = driver.getPageSource().contains("Заказ оформлен");
        System.out.println("Текст найден: " + flag);
    }
    public void clickBtnOk() {
        driver.findElement(btnOk).click();
    }
    public void clickBtnY() {
        driver.findElement(btnY).click();
    }
    public void inputComment(String s) {
        driver.findElement(comment).sendKeys(s);
        assert driver.findElement(comment).getAttribute("value").equals(s);
    }
    public void chekingcollor() {
        driver.findElement(collor).click();
    }
    public void inputDeliveryDate(String s) {
        driver.findElement(deliveryDate).sendKeys(s);
        driver.findElement(deliveryDate).sendKeys(ENTER);
        assert driver.findElement(deliveryDate).getAttribute("value").equals(s);
    }
    public void checkRentalPeriod() {
        driver.findElement(rentalPeriod).click();
    }
    public void clickRentalPeriod() {
        driver.findElement(CRentalPeriod).click();
    }
    public void clickBtnNext() {
        driver.findElement(btnNext).click();
    }
    public void checkStation() {
        driver.findElement(station).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(station).sendKeys(ENTER);
    }
    public void inputNumber(String s) {
        driver.findElement(number).sendKeys(s);
        assert driver.findElement(number).getAttribute("value").equals(s);
    }
    public void inputAdress(String s) {
        driver.findElement(adress).sendKeys(s);
        assert driver.findElement(adress).getAttribute("value").equals(s);
    }
    public void inputFirstName(String s) {
        driver.findElement(firstName).sendKeys(s);
        assert driver.findElement(firstName).getAttribute("value").equals(s);
    }
    public void inputName(String s) {
        driver.findElement(name).sendKeys(s);
        assert driver.findElement(name).getAttribute("value").equals(s);
    }
    public void scrollBtn(WebElement button) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});",
                button
        );
    }
    public void scrollDownBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1650)");
    }
    public void clickDownBtn() {
        driver.findElement(btnDown).click();
    }
    public void clickBtnUp() {
        driver.findElement(btnUp).click();
    }
}