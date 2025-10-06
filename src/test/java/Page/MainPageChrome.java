package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;

public class MainPageChrome {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;

    private By BtnOk = By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)");
    private By Btn2 = By.cssSelector("button.Button_Middle__1CSJM:nth-child(2)");
    private By Comment = By.cssSelector("input[placeholder='Комментарий для курьера']");
    private By Collor = By.xpath("//*[@id=\"black\"]");
    private By DataDelivery = By.cssSelector("input[placeholder='* Когда привезти самокат']");
    private By BtnNext = By.className("Button_Middle__1CSJM");
    private By MetroStation = By.cssSelector("input[placeholder='* Станция метро']");
    private By Number = By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']");
    private By Adress  = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");
    private By FirstName = By.cssSelector("input[placeholder='* Фамилия']");
    private By Name = By.cssSelector("input[placeholder='* Имя']");
    private By Btn = By.className("Button_Button__ra12g");
    private By RentalPeriod = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    private By BtnRentalPeriod = By.className("Dropdown-placeholder");

    public MainPageChrome(WebDriver driver) {
        this.driver = driver;
    }

    public void checkresult(String s) {
        boolean flag = driver.getPageSource().contains(s);
        System.out.println("Текст найден: " + flag);
    }

    public void clickBtnOk() {
        driver.findElement(BtnOk).click();
    }

    public void clickBtn2() {
        driver.findElement(Btn2).click();
    }

    public void inputComment(String s) {
        driver.findElement(Comment).sendKeys(s);
    }

    public void checkColor() {
        driver.findElement(Collor).click();
    }



    public void inputDateDelivery(String s) {
        driver.findElement(DataDelivery).sendKeys(s);
        //подтверждаем ввод
        driver.findElement(DataDelivery).sendKeys(ENTER);
    }

    public void clickBtnNext() {
        driver.findElement(BtnNext).click();
    }

    public void checkMetroStation() {
        driver.findElement(MetroStation).sendKeys(Keys.ARROW_DOWN);
        //подтверждаем выбор
        driver.findElement(MetroStation).sendKeys(ENTER);
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

    public void clickBtn() {
        driver.findElement(Btn).click();
    }

    public void getPage() {
        driver.get(URL);
    }

    public void checkRentalPeriod() {
        driver.findElement(RentalPeriod).click();
    }

    public void clickRentalPeriod() {
        driver.findElement(BtnRentalPeriod).click();
    }
}
