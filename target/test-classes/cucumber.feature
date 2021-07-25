@Login
Feature: To test the login feature of the wepage adactin

  @validLogin
  Scenario Outline: Validate the login feature with valid credentials
    Given Open the login page
    When Enter the "<Username>" and "<Password>"
    And Enter the click button
    Then User can enter into input page

    Examples: 
      | Username   | Password |
      | mngr341161 | erypUre  |

  @InvalidLogin
  Scenario Outline: Validate the login feature with invalid credentials
    Given Open the login page
    When Enter the "<Username>" and "<Password>"
    And Enter the click button
    Then User can see the error page

    Examples: 
      | Username   | Password |
      | gnanas     | erypUre  |
      | mngr341161 | gnanas   |
      | admin      | admin    |
