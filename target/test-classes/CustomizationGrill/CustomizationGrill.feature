#Author: nihirk
@CustomizationGrill

Feature: CustomizationGrill



Scenario: Validate the addition of customizable items
Given User is on items page and adds a customizable item
When user chooses available customizations
And clicks the Add to Cart button
Then item is added to cart with the valid customizations



Scenario: Validate the removal of customizable items
Given User is on items page and adds a customizable item and chooses the customizations
When user removes the customizations
And clicks the Add to Cart button
Then item is added to cart with the valid customizations


