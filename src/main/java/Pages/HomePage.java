package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

    @AndroidFindBy(id = "com.monefy.app.lite:id/expense_button_title")
    private MobileElement expenseButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/income_button_title")
    private MobileElement incomeButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/income_amount_text")
    private MobileElement incomeAmount;

    @AndroidFindBy(id = "com.monefy.app.lite:id/expense_amount_text")
    private MobileElement expenseAmount;

    @AndroidFindBy(id = "com.monefy.app.lite:id/balance_amount")
    private MobileElement balanceAmount;

    @AndroidFindBy(id = "com.monefy.app.lite:id/overflow")
    private MobileElement overFlowButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textMatches(\"Accounts\")")
    private MobileElement accountSettingsButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/currency_name")
    private MobileElement allAccountsDropDown;

    @AndroidFindBy(id = "com.monefy.app.lite:id/imageButtonAddCategory")
    private MobileElement plusIcon;

    @AndroidFindBy(accessibility = "Open navigation")
    private MobileElement filterButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Tap the \")")
    private MobileElement tipsOverlay;



    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public void navigateToAddExpensePage() {
        expenseButton.click();
    }

    public void navigateToAddIncomePage() {
        incomeButton.click();
    }

    public void navigateToAccountsSection() {
        waitUntilElementIsClickable(overFlowButton).click();
        waitUntilElementIsClickable(accountSettingsButton).click();
        waitUntilElementIsClickable(plusIcon).click();
    }

    public void navigateToAccountFilters(){
        waitUntilElementIsClickable(filterButton).click();
        waitUntilElementIsClickable(tipsOverlay).click();
        waitUntilElementIsClickable(allAccountsDropDown).click();
    }

    public String getIncomeAmount() {
        return incomeAmount.getText();
    }

    public String getExpenseAmount() {
        return expenseAmount.getText();
    }

    public String getBalanceAmount() {
        return balanceAmount.getText();
    }

    public boolean isAccountsDisplayed(String accountName) {
        return driver.findElementByAndroidUIAutomator("new UiSelector(). textMatches(\"" + accountName + "\")").isDisplayed();
    }
}
