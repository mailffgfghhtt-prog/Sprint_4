import org.junit.Test;
import org.junit.runners.Parameterized;
import page.FaqMainPage;
import java.util.*;
import java.util.function.Consumer;
public class FaqTest extends baseTest {
    private final String panelKey;
    private static final Map<String, Consumer<FaqMainPage>> PANEL_ACTIONS = new HashMap<>();
    static {
        PANEL_ACTIONS.put("Cost", page -> {
            page.clickCost();
            page.checkCost();
        });
        PANEL_ACTIONS.put("Quantity", page -> {
            page.clickQuantity();
            page.checkQuantity();
        });
        PANEL_ACTIONS.put("RentalTime", page -> {
            page.clickRentalTime();
            page.checkRentalTime();
        });
        PANEL_ACTIONS.put("Today", page -> {
            page.clickToday();
            page.checkToday();
        });
        PANEL_ACTIONS.put("Extension", page -> {
            page.clickExtension();
            page.checkExtension();
        });
        PANEL_ACTIONS.put("Charging", page -> {
            page.clickCharging();
            page.checkCharging();
        });
        PANEL_ACTIONS.put("Cancellation", page -> {
            page.clickCancellation();
            page.checkCancellation();
        });
        PANEL_ACTIONS.put("Availability", page -> {
            page.clickAvailability();
            page.checkAvailability();
        });
    }
    public FaqTest(String browserType, String panelKey) {
        super(browserType);
        this.panelKey = panelKey;
    }
    @Parameterized.Parameters(name = "Browser: {0}, Panel: {1}")
    public static Collection<Object[]> data() {
        List<Object[]> combinations = new ArrayList<>();
        for (String browser : Arrays.asList("chrome", "firefox")) {
            for (String panel : PANEL_ACTIONS.keySet()) {
                combinations.add(new Object[]{browser, panel});
            }
        }
        return combinations;
    }
    @Test
    public void testFaqPanel() {
        faqMainPage.openPage();
        faqMainPage.scrollDown();
        faqMainPage.clickCookie();
        Consumer<FaqMainPage> action = PANEL_ACTIONS.get(panelKey);
        if (action == null) {
            throw new IllegalArgumentException("Unknown panel: " + panelKey);
        }
        action.accept(faqMainPage);
    }
}