package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.Keys.ENTER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;

public class MainPage {


    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;
    private By BtnOk = By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)");
    private By BtnY = By.cssSelector("button.Button_Middle__1CSJM:nth-child(2)");
    private  By Comment = By.cssSelector("input[placeholder='Комментарий для курьера']");
    private By CRentalPeriod = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    private By Collor = By.xpath("//*[@id=\"black\"]");
    private By DeliveryDate = By.cssSelector("input[placeholder='* Когда привезти самокат']");
    private By RentalPeriod = By.className("Dropdown-placeholder");
    private By Btn2 = By.className("Button_Middle__1CSJM");
    private By Station = By.cssSelector("input[placeholder='* Станция метро']");
    private By Number = By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']");
    private By Adress = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");
    private By FirstName = By.cssSelector("input[placeholder='* Фамилия']");
    private By Name = By.cssSelector("input[placeholder='* Имя']");

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
        driver.findElement(BtnOk).click();
    }

    public void clickBtnY() {
        driver.findElement(BtnY).click();
    }

    public void inputComment(String s) {
        driver.findElement(Comment).sendKeys(s);
    }

    public void chekingcollor() {
        driver.findElement(Collor).click();
    }



    public void inputDeliveryDate(String s) {
        driver.findElement(DeliveryDate).sendKeys(s);
        driver.findElement(DeliveryDate).sendKeys(ENTER);
    }

    public void checkRentalPeriod() {
        driver.findElement(RentalPeriod).click();
    }

    public void clickRentalPeriod() {
        driver.findElement(CRentalPeriod).click();
    }

    public void clickBtn2() {
        driver.findElement(Btn2).click();
    }

    public void checkStation() {
        driver.findElement(Station).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(Station).sendKeys(ENTER);
    }

    public void inputNumber(String s) {
        driver.findElement(Number).sendKeys(s);
    }

    public void inputAdress(String s) {
        driver.findElement(Adress).sendKeys(s);
    }

    public void inputFirstName(String s) {
        driver.findElement(FirstName).sendKeys(s);
    }

    public void inputName(String s) {
        driver.findElement(Name).sendKeys(s);
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
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button")).click();
    }

    public void clickBtnUp() {
        driver.findElement(By.className("Button_Button__ra12g")).click();
    }
}
