import hiteshtestautomation.pages.ExplorePage;
import hiteshtestautomation.pages.OnboardingPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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

    @AfterMethod
    public void reinstallApp() {
        driver.removeApp("org.wikipedia.alpha");
        driver.installApp("//Users//hiteshmoudgil//Desktop//AutomationProjects//WikipediaAutomation//src//test//resources//app-alpha-universal-release.apk");
        // Launch the app again
        driver.activateApp("org.wikipedia.alpha");
    }

    @Test
    public void onboardingScreenShowUpTest() {
        //check that the first onboarding screen shows up
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "The Free Encyclopedia\n" +
                "…in over 300 languages", "The Onboarding screen did not show up.");
    }

    @Test
    public void skipOnboardingTest() throws InterruptedException {
        //assert user is on first onboarding screen
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "The Free Encyclopedia\n" +
                "…in over 300 languages");
        //Click on skip button on Onboarding screen
        onboardingPage.clickSkipButton();
        //Assert that user is on Explore page
        Assert.assertTrue(explorePage.verifyOnExplorePage());
    }

    @Test
    public void navigateToSecondOnboardingScreenUsingContinue() {
        //assert user is on first onboarding page screen
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "The Free Encyclopedia\n" +
                "…in over 300 languages");
        //move to next onboarding page
        onboardingPage.clickContinueButton();
        //assert user is on second onboarding page
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "New ways to explore");
    }

    @Test
    public void getStartedOnboardingTest() throws InterruptedException {
        //assert user is on first onboarding page screen
        Assert.assertEquals(onboardingPage.getCurrentOnboardingTitle(), "The Free Encyclopedia\n" +
                "…in over 300 languages");
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
}
