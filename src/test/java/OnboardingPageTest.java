import hiteshtestautomation.OnboardingPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnboardingPageTest extends BaseTest{
    private OnboardingPage onboardingPage;

    @BeforeMethod
    public void setup() {
        onboardingPage = new OnboardingPage(driver);
    }

    @Test
    public void skipOnboardingTest() throws InterruptedException {
        //Click on skip button on Onboarding screen
        onboardingPage.clickSkipButton();
        Thread.sleep(5000);
        //Assert.assertTrue();
    }


}
