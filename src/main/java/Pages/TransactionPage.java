package Pages;

import Inputs.CategoryType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TransactionPage extends BasePage {

    @AndroidFindBy(id = "com.monefy.app.lite:id/amount_text")
    private WebElement amountField;

    @AndroidFindBy(id = "com.monefy.app.lite:id/textViewNote")
    private WebElement noteField;

    @AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboardClear")
    private WebElement keyBoardBackButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/keyboard_action_button")
    private WebElement chooseCategoryButton;

    public TransactionPage(AndroidDriver driver) {
        super(driver);
    }

    public void enterExpenseDetailsForCategory(String amount, String note, CategoryType categoryType) {

        for (char digit :
                amount.toCharArray()) {
            clickKeysOnCalculator(digit);
        }
        waitUntilElementIsClickable(noteField).sendKeys(note);
        chooseCategoryButton.click();
        WebElement element = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"" + categoryType.getText() + "\")");
        waitUntilElementIsClickable(element).click();
    }

    public void enterIncomeDetailsForCategory(String amount, String note, CategoryType categoryType) {

        for (char digit :
                amount.toCharArray()) {
            clickKeysOnCalculator(digit);
        }
        waitUntilElementIsClickable(noteField).sendKeys(note);
        chooseCategoryButton.click();
        WebElement element = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"" + categoryType.getText() + "\")");
        waitUntilElementIsClickable(element).click();
    }

    public void enterIncomeDetails(String amount, String note) {

        for (char digit :
                amount.toCharArray()) {
            clickKeysOnCalculator(digit);
        }
        waitUntilElementIsClickable(noteField).sendKeys(note);
    }
}
