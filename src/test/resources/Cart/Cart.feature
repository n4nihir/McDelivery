#Author: nihirk
@Cart

Feature: Cart



Scenario: Validate the increase in quantity of item
Given User has added items to the cart and is on cart page
When user clicks on plus button
Then the quantity of the particular item in the cart increases



Scenario: Validate the decrease in quantity of item
Given User has added items to the cart and is on cart page and has increased the quantity of the particular item
When user clicks on minus button
Then the quantity of the particular item in the cart decreases


