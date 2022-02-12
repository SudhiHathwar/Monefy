package Tests;

import Inputs.CategoryType;
import Pages.AddAccountPage;
import Pages.HomePage;
import Pages.TransactionPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static org.testng.Assert.assertTrue;

public class MonefyTests extends BaseTest {

    private HomePage homePage;
    private TransactionPage expensePage;
    private AddAccountPage accountPage;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        expensePage = new TransactionPage(driver);
        accountPage = new AddAccountPage(driver);
    }

    @Test(dataProvider = "incomeExpenseData")
    public void addIncomeAndExpenseTransaction(String incomeAmount, String incomeNote, CategoryType incomeCategoryType, String expenseAmount, String expenseNote, CategoryType expenseCategoryType) {
        homePage.navigateToAddIncomePage();
        expensePage.enterIncomeDetailsForCategory(incomeAmount, incomeNote, incomeCategoryType);
        homePage.navigateToAddExpensePage();
        expensePage.enterExpenseDetailsForCategory(expenseAmount, expenseNote, expenseCategoryType);
        // TODO: Handle expected values from the parameters
        assertEquals(homePage.getIncomeAmount(), "$1,000.00");
        assertEquals(homePage.getExpenseAmount(), "$100.00");
        assertEquals(homePage.getBalanceAmount(), "Balance $900.00");
    }

    @Test
    public void addNewAccount() {
        homePage.navigateToAccountsSection();
        accountPage.createNewAccountForAmex("AMEX", "10000");
        homePage.navigateToAccountFilters();
        assertTrue(homePage.isAccountsDisplayed("AMEX"));
        assertTrue(homePage.isAccountsDisplayed("Cash"));
        assertTrue(homePage.isAccountsDisplayed("Payment card"));

        // TODO: Add asserts on the expense and income page
    }

    @DataProvider(name = "incomeExpenseData")
    private Object[][] incomeExpenseData() {
        return new Object[][]{
                {"1000.00", "Deposits", CategoryType.DEPOSITS, "100.00", "Bills", CategoryType.Bills}
        };
    }

}
