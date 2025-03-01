package hiteshtestautomation.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;

public class AndroidActions {

    AndroidDriver driver;

    public AndroidActions(AndroidDriver driver)
    {
        this.driver = driver;
    }

    public void swipeDownAction() {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 100,
                "top", 400,
                "width", driver.manage().window().getSize().width,
                "height", driver.manage().window().getSize().height / 2,
                "direction", "down",
                "percent", 1 // Swipe % of height
        ));
    }
}
