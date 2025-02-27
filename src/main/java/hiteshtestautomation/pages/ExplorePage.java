package hiteshtestautomation.pages;

import hiteshtestautomation.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.NetworkSpeed;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ExplorePage {
    AndroidDriver driver;
    AndroidActions androidActions;

    public ExplorePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
        androidActions = new AndroidActions(driver);
    }

    @AndroidFindBy (id = "org.wikipedia.alpha:id/main_toolbar_wordmark")
    private WebElement explorePageHeading;

    @AndroidFindBy (id = "org.wikipedia.alpha:id/day_header_text")
    private WebElement dayHeader;

    @AndroidFindBy (id = "org.wikipedia.alpha:id/view_card_header_title")
    private WebElement featuredArticleHeader;

    @AndroidFindBy (id = "org.wikipedia.alpha:id/articleTitle")
    private WebElement featuredArticleTitle;

    public WebElement getDayHeader() {
        return dayHeader;
    }

    public WebElement getFeaturedArticleHeader() {
        return featuredArticleHeader;
    }

    public WebElement getFeaturedArticleTitle() {
        return featuredArticleTitle;
    }

    public boolean verifyOnExplorePage() {
        return explorePageHeading.isDisplayed();
    }

    //public boolean

    public void pullToRefresh() {
        driver.setNetworkSpeed(NetworkSpeed.EDGE);
        androidActions.swipeDownAction();
        driver.setNetworkSpeed(NetworkSpeed.LTE);
    }
}
