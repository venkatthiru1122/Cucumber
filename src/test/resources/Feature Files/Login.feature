@Login
Feature: To check Login function in Facebook

  Background: 
    Given To open Chrome Browser

	Scenario: To pass valid username and valid password
    When To pass valid username and valid password
      #One Dimensional Map (WITH HEADER)
      | user-1 | java     |
      | user-2 | selenium |
      | pass-1 | 111      |
      | pass-2 | 222      |
    Then To close window

  Scenario: To pass invalid username and password
    When To pass invalid username and password
      #Two Dimensional Map 
      | user     | pass |
      
      | java     |  111 |
      | selenium |  222 |
      | python   |  333 |
      | devops   |  444 |
    Then To close window
