package hiteshtestautomation.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BottomTabBarPage {
    AndroidDriver driver;

    public BottomTabBarPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    @AndroidFindBy (id = "org.wikipedia.alpha:id/nav_tab_explore")
    private WebElement exploreTab;

    @AndroidFindBy (id = "org.wikipedia.alpha:id/nav_tab_reading_lists")
    private WebElement savedTab;

    @AndroidFindBy (id = "org.wikipedia.alpha:id/nav_tab_search")
    private WebElement searchTab;

    @AndroidFindBy (id = "org.wikipedia.alpha:id/nav_tab_edits")
    private WebElement editsTab;

    @AndroidFindBy (id = "org.wikipedia.alpha:id/nav_tab_more")
    private WebElement moreTab;

    public ExplorePage goToExplore() {
        exploreTab.click();
        return new ExplorePage(driver);
    }

    public SavedPage goToSaved() {
        savedTab.click();
        return new SavedPage(driver);
    }

    public SearchPage goToSearch() {
        searchTab.click();
        return new SearchPage(driver);
    }

    public EditsPage goToEdits() {
        editsTab.click();
        return new EditsPage(driver);
    }

    public MorePage goToMore() {
        moreTab.click();
        return new MorePage(driver);
    }
}
