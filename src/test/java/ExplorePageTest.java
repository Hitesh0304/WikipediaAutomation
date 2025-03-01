import hiteshtestautomation.pages.ExplorePage;
import hiteshtestautomation.pages.OnboardingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplorePageTest extends BaseTest {
    OnboardingPage onboardingPage;
    ExplorePage explorePage;

    @BeforeMethod
    public void setup() {
        onboardingPage = new OnboardingPage(driver);
        explorePage = new ExplorePage(driver);
    }

    @Test
    public void featureArticleSectionLoadsTest() {
        onboardingPage.clickSkipButton();
        explorePage.verifyOnExplorePage();
        Assert.assertEquals(explorePage.getFeaturedArticleHeader().getText(), "Featured article");
    }

    @Test
    public void pullToRefreshTest() {
        onboardingPage.clickSkipButton();
        explorePage.verifyOnExplorePage();
        explorePage.pullToRefresh();
        Assert.assertTrue(explorePage.getFeaturedArticleHeader().isDisplayed());
    }

    @Test
    public void searchDisplayedTest() {
        onboardingPage.clickSkipButton();
        explorePage.verifyOnExplorePage();
        Assert.assertTrue(explorePage.isSearchContainerDisplayed());
    }
}

