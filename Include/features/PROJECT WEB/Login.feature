
Feature: Login Feature

  Scenario Outline: Login Successfull
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button 
    Then User is navigated to dashboard

    Examples: 
      | username  | password |
      | Admin     | admin123 |
      
      
  Scenario Outline: Invalid Username
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button 
    Then User is navigated to dashboard

    Examples: 
      | username  | password |
      | test      | admin123 |
      
      
   Scenario Outline: Incorrect Password
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button 
    Then User is navigated to dashboard

    Examples: 
      | username  | password |
      | Admin     | test     |
      