package Pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddAccountPage extends BasePage {

    @AndroidFindBy(id = "com.monefy.app.lite:id/editTextCategoryName")
    private MobileElement accountNameField;

    @AndroidFindBy(id = "com.monefy.app.lite:id/initialAmount")
    private MobileElement initialAmountField;

    @AndroidFindBy(className = "android.widget.ImageView")
    private MobileElement amexAccountType;

    @AndroidFindBy(id = "com.monefy.app.lite:id/save")
    private MobileElement addButton;

    public AddAccountPage(AndroidDriver driver) {
        super(driver);
    }

    public void createNewAccountForAmex(String accountName, String initialAmount) {
        accountNameField.sendKeys(accountName);
        initialAmountField.sendKeys(initialAmount);
        amexAccountType.click();
        addButton.click();
    }
}
