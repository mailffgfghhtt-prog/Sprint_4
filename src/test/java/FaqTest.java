import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static page.MainFaqPage.*;

@RunWith(Parameterized.class)
public class FaqTest extends baseFaqTest {

    private String accordionId;
    private String expectedText;

    public FaqTest(String accordionId, String expectedText) {
        super(accordionId, expectedText);
        this.accordionId = accordionId;
        this.expectedText = expectedText;
    }

    @Test
    public void checkFaq() {
        mainFaqPage.getPage();
        mainFaqPage.scrollDown();
        mainFaqPage.clickCookie();
        mainFaqPage.openAccordion();


        String actualText = mainFaqPage.getTextByAccordionId();


        Assert.assertEquals(
                "Текст в строке faq не соответствует ожидаемому",
                expectedText,
                actualText
        );
    }

    @Parameterized.Parameters
    public static Collection<Object[]> faqTestData() {
        return Arrays.asList(new Object[][] {
                {question_1(), "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {question_2(), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {question_3(), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {question_4(), "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {question_5(), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {question_6(), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {question_7(), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {question_8(), "Да, обязательно. Всем самокатов! И Москве, и Московской области."}
        });
    }
}
