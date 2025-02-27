import hiteshtestautomation.ExplorePage;
import hiteshtestautomation.OnboardingPage;
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
}

