import org.junit.Test;


public class ScooterFormUp extends baseTest{

    public ScooterFormUp(String browser) {
        super(browser);
    }

    @Test
    public void scooterRentalFormUp() {
        minePage.getPage();
        minePage.clickBtnUp();
        minePage.inputName("Валерий");
        minePage.assertName("Валерий");
        minePage.inputFirstName("Дакота");
        minePage.assertFirstName("Дакота");
        minePage.inputAdress("Кремль");
        minePage.assertAdress("Кремль");
        minePage.inputNumber("+79613306619");
        minePage.assertNumber("+79613306619");
        minePage.checkStation();
        minePage.clickBtnNext();
        minePage.inputDeliveryDate("28.11.2025");
        minePage.assertDeliveryDate("28.11.2025");
        minePage.clickRentalPeriod();
        minePage.checkRentalPeriod();
        minePage.chekingcollor();
        minePage.inputComment("За час позвонить");
        minePage.assertComment("За час позвонить");
        minePage.clickBtnY();
        minePage.clickBtnOk();
        minePage.clickStatusBtn();
        minePage.chekingText();
    }


}