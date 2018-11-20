Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Finding some cheese
   Given I am on the Google search page
   When I search for "Cheese!"
   Then the page title should start with "cheese"
  Scenario: Some cukes
  	Given I have 48 cukes in my belly