import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class OnboardingPageTest extends BaseTest{

    @Test
    public void skipOnboardingTest() {
        driver.findElement(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
        //Assert that user is on Explore screen
        //Assert.assertTrue();
    }
}
