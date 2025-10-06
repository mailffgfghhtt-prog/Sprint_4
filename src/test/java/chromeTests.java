import org.junit.Test;

public class chromeTests extends chromeBaseTest{



    @Test
    public void ChromeFormsTest() {
        mainPageChrome.getPage();
        mainPageChrome.clickBtn();
        mainPageChrome.inputName("Игорь");
        mainPageChrome.inputFirstName("Крутой");
        mainPageChrome.inputAdress("Кремль");
        mainPageChrome.inputNumber("+79515142053");
        mainPageChrome.checkMetroStation();
        mainPageChrome.clickBtnNext();
        mainPageChrome.inputDateDelivery("22.02.2026");
        mainPageChrome.clickRentalPeriod();
        mainPageChrome.checkRentalPeriod();
        mainPageChrome.checkColor();
        mainPageChrome.inputComment("Привезите после 15:00");
        mainPageChrome.clickBtn2();
        mainPageChrome.clickBtnOk();
        mainPageChrome.checkresult("Заказ оформлен");
    }




}



