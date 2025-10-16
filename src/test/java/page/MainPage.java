package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.Keys.ENTER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;


public class MainPage {
    private WebDriver driver;

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private By btnOk = By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)");
    private By btnY = By.cssSelector("button.Button_Middle__1CSJM:nth-child(2)");
    private By comment = By.cssSelector("input[placeholder='Комментарий для курьера']");
    private By сRentalPeriod = By.cssSelector(".Dropdown-arrow");
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
    private By statusBtn = By.cssSelector(".Order_NextButton__1_rCA > button:nth-child(1)");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(URL);
    }

    public void chekingText() {
        boolean flag = driver.getPageSource().contains("Заберите самокат и оплатите аренду");
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

    public void clickStatusBtn() {
        driver.findElement(statusBtn).click();
    }

    public void clickRentalPeriod() {
        driver.findElement(сRentalPeriod).click();
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


    public void assertComment(String s) {
        String actualComment = driver.findElement(comment).getAttribute("value");
        String expectedComment = s;
        Assert.assertEquals("Введённый комментарий не совпадает с ожидаемым", expectedComment, actualComment);
    }

    public void assertDeliveryDate(String s) {
        String actualDeliveryDate = driver.findElement(deliveryDate).getAttribute("value");
        String expectedDeliveryDate = s;
        Assert.assertEquals("Введённая дата не совпадает с ожидаемым", expectedDeliveryDate, actualDeliveryDate);
    }

    public void assertNumber(String s) {
        String actualNumber = driver.findElement(number).getAttribute("value");
        String expectedNumber = s;
        Assert.assertEquals("Введённый номер не совпадает с ожидаемым", expectedNumber, actualNumber);
    }

    public void assertAdress(String s) {
        String actualAdress = driver.findElement(adress).getAttribute("value");
        String expectedAdress = s;
        Assert.assertEquals("Введённый адрес не совпадает с ожидаемым", expectedAdress, actualAdress);
    }

    public void assertFirstName(String s) {
        String actualFirstName = driver.findElement(firstName).getAttribute("value");
        String expectedFirstName = s;
        Assert.assertEquals("Введённая фамилия не совпадает с ожидаемым", expectedFirstName, actualFirstName);
    }

    public void assertName(String s) {
        String actualName = driver.findElement(name).getAttribute("value");
        String expectedName = s;
        Assert.assertEquals("Введённое имя не совпадает с ожидаемым", expectedName, actualName);
    }
}