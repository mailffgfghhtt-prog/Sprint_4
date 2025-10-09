import org.junit.Test;

public class FirefoxTest extends baseTest {

    @Test
    public void firefoxFormaTest() {
        minePage.getPage();
        minePage.scrollDownBtn();
        minePage.clickDownBtn();
        minePage.inputName("Игорь");
        minePage.inputFirstName("Крутой");
        minePage.inputAdress("Кутузовский 34");
        minePage.inputNumber("+79515142053");
        minePage.checkStation();
        minePage.clickBtnNext();
        minePage.inputDeliveryDate("22.02.2026");
        minePage.clickRentalPeriod();
        minePage.checkRentalPeriod();
        minePage.chekingcollor();
        minePage.inputComment("Привезите после 15:00");
        minePage.clickBtnY();
        minePage.clickBtnOk();
        minePage.chekingText();
    }
}