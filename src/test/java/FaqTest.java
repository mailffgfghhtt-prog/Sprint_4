import org.junit.Test;
public class FaqTest extends baseTest {
    public FaqTest(String browserType) {
        super(browserType);
    }
    @Test
    public void testAccordionOnePanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        faqMainPage.clickCost();
        faqMainPage.checkCost();
    }
    @Test
    public void testAccordionTwoPanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        faqMainPage.clickQuantity();
        faqMainPage.checkQuantity();
    }
    @Test
    public void testAccordionFreePanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        faqMainPage.clickRentalTime();
        faqMainPage.checkRentalTime();
    }
    @Test
    public void testAccordionFoPanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        faqMainPage.clickToday();
        faqMainPage.checkToday();
    }
    @Test
    public void testAccordionFivePanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        faqMainPage.clickExtension();
        faqMainPage.checkExtension();
    }
    @Test
    public void testAccordionSixPanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        faqMainPage.clickCharging();
        faqMainPage.checkCharging();
    }
    @Test
    public void testAccordionSevenPanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        faqMainPage.clickCancellation();
        faqMainPage.checkCancellation();
    }
    @Test
    public void testAccordionEightPanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        faqMainPage.clickAvailability();
        faqMainPage.checkAvailability();
    }
}
