import hiteshtestautomation.ExplorePage;
import hiteshtestautomation.OnboardingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnboardingPageTest extends BaseTest{
    private OnboardingPage onboardingPage;
    private ExplorePage explorePage;

    @BeforeMethod
    public void setup() {
        onboardingPage = new OnboardingPage(driver);
        explorePage = new ExplorePage(driver);
    }

    @Test
    public void skipOnboardingTest() throws InterruptedException {
        //assert user is on first onboarding screen
        onboardingScreensStarted();
        //Click on skip button on Onboarding screen
        onboardingPage.clickSkipButton();
        //Assert that user is on Explore page
        Assert.assertTrue(explorePage.verifyOnExplorePage());
    }

    @Test
    public void getStartedOnboardingTest() throws InterruptedException {
        //assert user is on first onboarding page screen
        onboardingScreensStarted();
        //move to next onboarding page
        onboardingPage.clickContinueButton();

        //assert user is on second onboarding page
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "New ways to explore");
        //move to next onboarding page
        onboardingPage.clickContinueButton();

        //assert user is on third onboarding page
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "Reading lists with sync");
        //move to next onboarding page
        onboardingPage.clickContinueButton();

        //assert user is on fourth onboarding page
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "Data & Privacy");
        //finish onboarding
        onboardingPage.clickGetStartedButton();

        //Assert that user is on Explore page
        Assert.assertTrue(explorePage.verifyOnExplorePage());
    }

    public void onboardingScreensStarted() {
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "The Free Encyclopedia\n" +
                "…in over 300 languages");
    }
}
