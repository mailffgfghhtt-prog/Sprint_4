package page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.Keys.ENTER;
public class FormMainPage {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;
    private By chooseStatus = By.cssSelector(".Order_NextButton__1_rCA > button:nth-child(1)");
    private By clickOk = By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)");
    private By clickOrder = By.cssSelector("button.Button_Middle__1CSJM:nth-child(2)");
    private By chooseRental = By.cssSelector("div.Dropdown-option:nth-child(2)");
    private By clickRental = By.cssSelector(".Dropdown-arrow");
    private By chooseCollor = By.xpath("//*[@id=\"black\"]");
    private By inputComment = By.cssSelector("input[placeholder='Комментарий для курьера']");
    private By rentalDate = By.cssSelector("input[placeholder='* Когда привезти самокат']");
    private By next = By.className("Button_Middle__1CSJM");
    private By number = By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']");
    private By station = By.cssSelector("input[placeholder='* Станция метро']");
    private By adress = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");
    private By firstName = By.cssSelector("input[placeholder='* Фамилия']");
    private By btnOrder = By.className("Button_Button__ra12g");
    private By cookie = By.id("rcc-confirm-button");
    private By name = By.cssSelector("input[placeholder='* Имя']");
    public FormMainPage(WebDriver driver) {
        this.driver = driver;
    }
    public static void checkText() {
        String actual = "Ну всё, теперь кататься\n" +
                "Пока не закончится аренда";
        String expected = "Ну всё, теперь кататься\n" +
                "Пока не закончится аренда";
        Assert.assertEquals(expected, actual);
    }
    public void clickChooseStatus() {
        driver.findElement(chooseStatus).click();
    }
    public void clickOk() {
        driver.findElement(clickOk).click();
    }
    public void clickOrder() {
        driver.findElement(clickOrder).click();
    }
    public void chooseRentalPeriod() {
        driver.findElement(chooseRental).click();
    }
    public void clickRentalPeriod() {
        driver.findElement(clickRental).click();
    }
    public void chooseColor() {
        driver.findElement(chooseCollor).click();
    }
    public void inputComment(String s) {
        driver.findElement(inputComment).sendKeys(s);
    }
    public void inputRentaleDate(String s) {
        driver.findElement(rentalDate).sendKeys(s);
        driver.findElement(rentalDate).sendKeys(ENTER);
    }
    public void clickNext() {
        driver.findElement(next).click();
    }
    public void inputNumber(String s) {
        driver.findElement(number).sendKeys(s);
    }
    public void chooseStation() {
        driver.findElement(station).click();
        driver.findElement(station).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(station).sendKeys(ENTER);
    }
    public void inputAdress(String s) {
        driver.findElement(adress).sendKeys(s);
    }
    public void inputFirstName(String s) {
        driver.findElement(firstName).sendKeys(s);
    }
    public void clickBtnOrder() {
        driver.findElement(btnOrder).click();
    }
    public void clickCookie() {
        driver.findElement(cookie).click();
    }
    public void inputName(String s) {
        driver.findElement(name).sendKeys(s);
    }
    public void openPage() {
        driver.get(URL);
    }
    public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 350)");
    }
}
