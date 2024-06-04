
Feature: TakeMyTicketsLogin
 
 
 @Test
Scenario: TakeMyTicketsLogin
Given Login to TMT Portal
When user gets the title of the page
Then Page title should be "TakeMyTickets: Buy and sell concert tickets in India"

