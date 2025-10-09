import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ImportantQuestionsTest extends baseTest {
    // Поле для хранения номера проверки
    private final int checkNumber;
    // Конструктор с параметром
    public ImportantQuestionsTest(int checkNumber) {
        this.checkNumber = checkNumber;
    }
    // Метод для предоставления параметров
    @Parameters
    public static Object[][] data() {
        return new Object[][]{
                {1}, {2}, {3}, {4},
                {5}, {6}, {7}, {8}
        };
    }
    @Test
    public void textValidTest() {
        mainAHPage.getPage();
        mainAHPage.scrollDown();
        mainAHPage.clickCookie();
        // Динамический вызов метода через рефлексию
        try {
            String methodName = "checkAH" + checkNumber;
            mainAHPage.getClass().getMethod(methodName).invoke(mainAHPage);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при проверке AH" + checkNumber, e);
        }
    }
}