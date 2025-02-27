package hiteshtestautomation.pages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

@Getter
public class OnboardingPage {
    private AndroidDriver driver;

    public OnboardingPage (AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    @AndroidFindBy(id = "org.wikipedia.alpha:id/fragment_onboarding_skip_button")
    private WebElement skipButton;

    @AndroidFindBy(id = "org.wikipedia.alpha:id/addLanguageButton")
    private WebElement addEditLanguages;

    @AndroidFindBy(id = "org.wikipedia.alpha:id/fragment_onboarding_forward_button")
    private WebElement continueButton;

    @AndroidFindBy(id = "org.wikipedia.alpha:id/fragment_onboarding_done_button")
    private WebElement getStartedButton;

    @AndroidFindBy(id = "org.wikipedia.alpha:id/primaryTextView")
    private WebElement primaryTextView;

    public String getCurrentOnboardingTitle() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this); // Refresh elements
        return primaryTextView.getText();
    }

    public void clickSkipButton() {
        skipButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickGetStartedButton() {
        getStartedButton.click();
    }
}
