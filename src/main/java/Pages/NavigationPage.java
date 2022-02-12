package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NavigationPage extends BasePage {

    @AndroidFindBy(id = "com.monefy.app.lite:id/buttonClose")
    private WebElement closeOverlayButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"GET STARTED\")")
    private WebElement getStartedButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"AMAZING\")")
    private WebElement amazingButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"READY\")")
    private WebElement iAmReadyButton;

    public NavigationPage(AndroidDriver driver) {
        super(driver);
    }

    public void goToHomePage() {
        waitUntilElementIsClickable(getStartedButton).click();
        waitUntilElementIsClickable(amazingButton).click();
        waitUntilElementIsClickable(iAmReadyButton).click();
        waitUntilElementIsClickable(closeOverlayButton).click();
    }
}
