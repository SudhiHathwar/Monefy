# Exploratory testing task for Monefy app

## Charters

|Explore target | With resources | To discover information|
| --------------- | ---------------- | ------------------ |
|Explore adding a new income with cash for deposits category | With different income data|To identify potential issue while adding different types of income information to the balance sheet
|Explore adding a new income with payment card for salary|With different income data|To identify potential issue while adding different types of income information to the balance sheet
|Explore adding a new income with payment card for savings |With different income data|To identify potential issue while adding different types of income information to the balance sheet
|Explore adding a new account |With different names |With different initial balance account data and Initial balance date|To identify potential issues while adding a new account with different balance amounts and Initial balance date
|Explore adding a new income with newly created account|With different income data|To identify potential issue while adding different types of income information to the balance sheet
|Explore balance sheet balance amount|With different accounts|To identify potential issues with displaying balance for different accounts
|Explore adding a multiple expense for all categories|With different expense amounts and for all categories|To identify any potential issues with adding and displaying the expenses on the balance chart
|Explore removing/deleting an expense with each category|With different amounts|To identify any potential issue while removing an expense from the balance sheet
|Explore removing/deleting an income with each category|With different amounts|To identify any potential issue while removing an income and to verify if the balance sheet has right values
|Explore calculation options available while adding an expense/income|With different operations and amounts|To identify any potential issue while making any calculations on the expense/income amounts
|Explore closing the app and reopening|-|To identify any potential data loss when the app is closed and reopened.
|Explore adding expenses and income for future and start dates|With different dates in past and future|To identify any potential issue while adding the expenses for past or future days and to verify how the data is displayed on balance sheet
|Explore balance sheet with different timeline|With different timelines|To identify potential issues with displaying balance for different timelines
|Add expenses for different account types|With different accounts|To identify potential issues while adding expenses for different accounts
|Explore filter options for accounts|With different accounts|To identify potential issues while filtering the balance with different accounts
|Explore balance sheet |With different categories|To identify potential issues while checking if the all the incomes and expenses are displayed for given account and timeline
|Explore balance sheet graph|With different expense amount and incomes|To identify potential issues while checking if all the expenses are displayed with right % ratio
|Explore Search options|With multiple data|To identify potential issues with search engine
|Explore transfer from one account to another account|With multiple amounts and dates|To identify potential issues while transferring amount from one account to another for different dates
|Explore menu item on the top right corner|-|To identify potential issues in the menu options
|Explore balance view modes|With different options|To identify potential issue while displaying the balance with different options selected
|Explore languages|With multiple different languages|To identify potential issues with localisation
|Explore first day of the week settings|With multiple different days|To identify potential issues with displaying the timeline on the balance graph when filtered by Weeks timeline
|Explore first day of the month settings|With multiple different days|To identify potential issues with displaying the timeline on the balance graph when filtered by Months timeline
|Explore review | - |To check if the redirection is correct|
|Explore export| - |To identify potential issues with export option
|Explore About,privacy policy and copy purchase Id options | - |To identify potential issues with expected behavior of the options
|Explore data backup options | - |To identify potential issues with expected behavior of the options
|Explore synchronization options|-| To identify potential issues with expected behavior of the options
|Explore adding expenses by clicking on categories on the balance chart|With multiple amounts and dates|To identify potential issues while adding expenses from the category icon on balance chart
|Explore adding expense from category icons when filtered by days by scrolling to a past date from the home page|With multiple amounts|To identify potential issues while adding expenses for the past date.



### Findings from the charters.

There were no major issues found in the application. But I found few minor/trivial issues with in the application as mentioned below

1. The localisation feature doesnt change the category names/text into local language.
2. The calculator component doesn't have any validation errors (maximum characters) supported for text and amount field


### Prioritisation of charters.

I would basically start the exploratory testing from the top to bottom approach. Going by component to component and followed by feature to feature.

### How much time you have planned for each charter?

On an average of 5 - 10 minutes per charter 

### What kind of risks you need to mitigate for this type of application?

Since this app is mainly about data, Data leak and data loss are the biggest risks for this application that I would plan to mitigate
