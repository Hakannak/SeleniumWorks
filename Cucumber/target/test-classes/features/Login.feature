#Author:john.smith@wellsfargo.com
@Sprint3
Feature: Login

  Background: 
    Given I see OrangeHrm logo

  @smoke @login
  Scenario: Valid login
    When I enter valid username and password
    And I click login button
    Then I successfully logged in

  @regression @login
  Scenario: Invalid login
    Given I see OrangeHrm logo
    When I enter invalid username and password
    And I click login button
    Then I see error message is displayed

  @temp
  Scenario: Error message Validation
    When I enter invalid username and password I see errorMessage
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Admin1   | Syntax123  | errorMessage        |
      | Admin1   | Syntax123! | errorMessage        |
