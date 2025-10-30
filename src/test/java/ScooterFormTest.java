import org.junit.Test;
public class ScooterFormTest extends baseTest {
    public ScooterFormTest(String browserType) {
        super(browserType);
    }
    @Test
    public void rentalFormTest() {
        formMainPage.openPage();
        formMainPage.clickBtnOrder();
        formMainPage.clickCookie();
        formMainPage.inputName("Игорь");
        formMainPage.inputFirstName("Приветливый");
        formMainPage.inputAdress("Кремль");
        formMainPage.chooseStation();
        formMainPage.inputNumber("89613306619");
        formMainPage.clickNext();
        formMainPage.inputRentaleDate("22.12.2025");
        formMainPage.clickRentalPeriod();
        formMainPage.chooseRentalPeriod();
        formMainPage.chooseColor();
        formMainPage.inputComment("позвонить за час!");
        formMainPage.clickOrder();
        formMainPage.clickOk();
        formMainPage.clickChooseStatus();
        formMainPage.checkText();
    }
    @Test
    public void rentalFormTestDown() {
        formMainPage.openPage();
        formMainPage.scrollDown();
        formMainPage.clickBtnOrder();
        formMainPage.clickCookie();
        formMainPage.inputName("Яков");
        formMainPage.inputFirstName("Местный");
        formMainPage.inputAdress("Пензенская, 34");
        formMainPage.chooseStation();
        formMainPage.inputNumber("89930885623");
        formMainPage.clickNext();
        formMainPage.inputRentaleDate("23.11.2026");
        formMainPage.clickRentalPeriod();
        formMainPage.chooseRentalPeriod();
        formMainPage.chooseColor();
        formMainPage.inputComment("Привезти после 15:00");
        formMainPage.clickOrder();
        formMainPage.clickOk();
        formMainPage.clickChooseStatus();
        formMainPage.checkText();
    }
}