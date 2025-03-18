import hiteshtestautomation.pages.SavedPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SavedPageTest extends BaseTest {
    SavedPage savedPage;

    @BeforeMethod
    public void setup() {
        onboardingPage.clickSkipButton();
        savedPage = bottomTabBarPage.goToSaved();
    }

    @Test
    public void userOnSavedScreenTest() {
        Assert.assertEquals(savedPage.getPageTitle(), "Saved");
    }
}
