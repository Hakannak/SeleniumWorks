#Author: syntax team    //john.smith@wellsfargo.com
Feature: Add Employee

  Background: 
    Given I logged in into OrangeHrm
    And I click on PIM link
    And I click on Add Employee link

  @smoke @AddEmployee
  Scenario Outline: Add Employee
    When I provide "<FirstName>" , "<MiddleName>", "<LastName>" and "<Location>"
    And I click on save button
    Then I see employee is added successfully
    And I close browser

    Examples: 
      | FirstName | MiddleName | LastName | Location             |
      | Janes     | F          | Jonat    | Canadian Regional HQ |
      | Ferry     | F          | Jonas    | France Regional HQ   |
      | Henry     | F          | Jordan   | London Office        |

  Scenario: Add Employee and Create Login Details
    When I provide firstname,middlename,lastname and location
    And I click on create login details
    And I provide all mandatory fields
    Then I see employee is added successfully

@temp1
  Scenario: Add Employee Labels Verification
    Then I see following labels
      | First Name  |
      | Middle Name |
      | Last Name   |
      | Employee Id |
      | Location    |
