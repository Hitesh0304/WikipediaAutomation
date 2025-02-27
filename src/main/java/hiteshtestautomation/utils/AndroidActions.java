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
                "left", 100,  // Start from the left edge
                "top", 200, // Start a bit below the status bar
                "width", driver.manage().window().getSize().width,  // Full screen width
                "height", driver.manage().window().getSize().height / 2, // Half the screen height
                "direction", "down",
                "percent", 1 // Swipe % of height
        ));
    }
}
