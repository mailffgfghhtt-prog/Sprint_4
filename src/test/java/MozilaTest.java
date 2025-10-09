import org.junit.Test;

public class MozilaTest extends baseTest{

    @Test
    public void firefoxFormsTest() {
        minePage.getPage();
        minePage.clickBtnUp();
        minePage.inputName("Валерий");
        minePage.inputFirstName("Дакота");
        minePage.inputAdress("Кремль");
        minePage.inputNumber("+79613306619");
        minePage.checkStation();
        minePage.clickBtnNext();
        minePage.inputDeliveryDate("28.11.2025");
        minePage.clickRentalPeriod();
        minePage.checkRentalPeriod();
        minePage.chekingcollor();
        minePage.inputComment("За час позвонить");
        minePage.clickBtnY();
        minePage.clickBtnOk();
        minePage.chekingText();
    }
}