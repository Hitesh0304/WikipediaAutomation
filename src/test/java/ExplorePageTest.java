import hiteshtestautomation.pages.ExplorePage;
import hiteshtestautomation.pages.OnboardingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplorePageTest extends BaseTest {

    @Test
    public void featureArticleSectionLoadsTest() {
        ExplorePage explorePage = onboardingPage.clickSkipButton();
        explorePage.verifyOnExplorePage();
        Assert.assertEquals(explorePage.getFeaturedArticleHeader().getText(), "Featured article");
    }

    @Test
    public void pullToRefreshTest() {
        ExplorePage explorePage = onboardingPage.clickSkipButton();
        explorePage.verifyOnExplorePage();
        explorePage.pullToRefresh();
        Assert.assertTrue(explorePage.getFeaturedArticleHeader().isDisplayed());
    }

    @Test
    public void searchDisplayedTest() {
        ExplorePage explorePage = onboardingPage.clickSkipButton();
        explorePage.verifyOnExplorePage();
        Assert.assertTrue(explorePage.isSearchContainerDisplayed());
    }
}

