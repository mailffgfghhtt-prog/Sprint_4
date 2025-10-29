import org.junit.Test;
import org.junit.runners.Parameterized;
public class FaqTest extends baseTest {
    private final String panelKey;
    public FaqTest(String browserType, String panelKey) {
            super(browserType);
            this.panelKey = panelKey;
        }
        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {"chrome", "Cost"},
                    {"chrome", "Quantity"},
                    {"chrome", "RentalTime"},
                    {"chrome", "Today"},
                    {"chrome", "Extension"},
                    {"chrome", "Charging"},
                    {"chrome", "Cancellation"},
                    {"chrome", "Availability"}
            };
        }
        @Test
        public void FaqTest() {
            faqMainPage.openPage();
            faqMainPage.scrollDown();
            faqMainPage.clickCookie();
            switch (panelKey) {
                case "Cost":
                    faqMainPage.clickCost();
                    faqMainPage.checkCost();
                    break;
                case "Quantity":
                    faqMainPage.clickQuantity();
                    faqMainPage.checkQuantity();
                    break;
                case "RentalTime":
                    faqMainPage.clickRentalTime();
                    faqMainPage.checkRentalTime();
                    break;
                case "Today":
                    faqMainPage.clickToday();
                    faqMainPage.checkToday();
                    break;
                case "Extension":
                    faqMainPage.clickExtension();
                    faqMainPage.checkExtension();
                    break;
                case "Charging":
                    faqMainPage.clickCharging();
                    faqMainPage.checkCharging();
                    break;
                case "Cancellation":
                    faqMainPage.clickCancellation();
                    faqMainPage.checkCancellation();
                    break;
                case "Availability":
                    faqMainPage.clickAvailability();
                    faqMainPage.checkAvailability();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown panel: " + panelKey);
            }
        }
    }
