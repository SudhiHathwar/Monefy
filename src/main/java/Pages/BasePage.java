package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.joda.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    private static final long DEFAULT_TIME_OUT = 3;
    protected final AndroidDriver driver;

    protected BasePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
    }

    public void clickKeysOnCalculator(char key) {
        WebElement element;
        /***
         * Remaining conditions can be added here
         */
        switch (key) {
            case '.':
                element = driver.findElementById("com.monefy.app.lite:id/buttonKeyboardDot");
                break;
            default:
                element = driver.findElementById("com.monefy.app.lite:id/buttonKeyboard" + key);
                break;
        }
        waitUntilElementIsClickable(element).click();
    }

    public WebElement waitUntilElementIsClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.standardSeconds(DEFAULT_TIME_OUT).getStandardSeconds());
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
}
