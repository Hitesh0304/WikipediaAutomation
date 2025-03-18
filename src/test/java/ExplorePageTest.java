import hiteshtestautomation.pages.ExplorePage;
import hiteshtestautomation.pages.OnboardingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplorePageTest extends BaseTest {
    ExplorePage explorePage;

    @BeforeClass
    public void setup() {
        explorePage = onboardingPage.clickSkipButton();
        explorePage.verifyOnExplorePage();
    }

    @Test
    public void featureArticleSectionLoadsTest() {
        Assert.assertEquals(explorePage.getFeaturedArticleHeader().getText(), "Featured article");
    }

    @Test
    public void pullToRefreshTest() {
        explorePage.pullToRefresh();
        Assert.assertTrue(explorePage.getFeaturedArticleHeader().isDisplayed());
    }

    @Test
    public void searchTabDisplayedTest() {
        Assert.assertTrue(explorePage.isSearchContainerDisplayed());
    }
}

