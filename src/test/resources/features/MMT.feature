#Author: Varsha Rajput
@Test
Feature: Feature to test Login Functionality

  @Login
  Scenario: Validate Login in the application.
   Given Launch Application
   
    When User Click on ToCity
    When User Click on FromCity
    And User Selects Date 
    And User Click On Search
    Then Flight List Diplays
  