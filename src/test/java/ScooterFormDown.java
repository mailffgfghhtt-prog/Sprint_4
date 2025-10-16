import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class ScooterFormDown extends baseTest {


    public ScooterFormDown(String browser) {
        super(browser);
    }

    @Test
    public void scooterRentalFormDown() {
        minePage.getPage();
        minePage.scrollDownBtn();
        minePage.clickDownBtn();
        minePage.inputName("Игорь");
        minePage.assertName("Игорь");
        minePage.inputFirstName("Крутой");
        minePage.assertFirstName("Крутой");
        minePage.inputAdress("Кутузовский 34");
        minePage.assertAdress("Кутузовский 34");
        minePage.inputNumber("+79515142053");
        minePage.assertNumber("+79515142053");
        minePage.checkStation();
        minePage.clickBtnNext();
        minePage.inputDeliveryDate("22.02.2026");
        minePage.assertDeliveryDate("22.02.2026");
        minePage.clickRentalPeriod();
        minePage.checkRentalPeriod();
        minePage.chekingcollor();
        minePage.inputComment("Привезите после 15:00");
        minePage.assertComment("Привезите после 15:00");
        minePage.clickBtnY();
        minePage.clickBtnOk();
        minePage.clickStatusBtn();
        minePage.chekingText();
    }


}