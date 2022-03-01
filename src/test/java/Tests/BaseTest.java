package Tests;

import Pages.NavigationPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    public static AndroidDriver<MobileElement> driver;
    private NavigationPage navigationPage;

    @BeforeSuite
    public void setUp() throws MalformedURLException {

        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

        URL url = new URL(URL_STRING);

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // TODO: Add configuration run tests for local execution
        // capabilities.setCapability("platformName", Platform.ANDROID);
        // capabilities.setCapability("automationName", "uiautomator2");
        // capabilities.setCapability("appPackage", "com.monefy.app.lite");
        // capabilities.setCapability("appActivity", "com.monefy.activities.main.MainActivity_");
        // capabilities.setCapability("fullReset", true);
        // capabilities.setCapability("deviceName", "emulator-5554");
        // capabilities.setCapability("app", "/Users/s.manjunath/Documents/Project/Monefy/com.monefy.app.lite_2021-12-17.apk");
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @BeforeClass
    public void navigateTo() {
        navigationPage = new NavigationPage(driver);
        navigationPage.goToHomePage();
    }
}
