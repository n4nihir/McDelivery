#Author: amit
@UserLocation

 

Feature: Location 



Scenario: Validate the display of location at the top navbar
Given User is on main page
When User selects location on map
And clicks done button
Then Selected location is displayed at the top Navbar of the website


