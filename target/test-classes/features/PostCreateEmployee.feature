Feature: Validating Syntax HRMS API's

  Background:
    Given user generates token
@APITest
  Scenario: Creating an employee through API


    Given user calls createEmployee API request
    When  user retrieves response
    Then  status code is 201
    Then  user validates employee is created
