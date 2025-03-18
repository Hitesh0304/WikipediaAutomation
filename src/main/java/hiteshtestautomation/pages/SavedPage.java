package hiteshtestautomation.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SavedPage {
    AndroidDriver driver;

    public SavedPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    @AndroidFindBy (xpath = "(//android.widget.TextView[@text=\"Saved\"])[1]")
    private WebElement pageTitle;

    public String getPageTitle() {
        return pageTitle.getText();
    }
}
