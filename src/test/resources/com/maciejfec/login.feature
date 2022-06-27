Feature: Logging In

  Background:
    Given I am on the login page

  Scenario: Submitting an empty login form
    When I press the login button
    Then An error should appear

  Scenario Outline: Submitting a partially complete login form
    Given I input a "<username>"
    When I press the login button
    Then An error should appear

    Examples:
      | username      |
      | standard_user |

  Scenario Outline: Logging in with incorrect username
    Given I input a "<username>"
    And I input a "<password>"
    When I press the login button
    Then An error should appear

    Examples:
      | username  | password     |
      | fake_user | secret_sauce |

  Scenario Outline: Logging in with incorrect password
    Given I input a "<username>"
    And I input a "<password>"
    When I press the login button
    Then An error should appear

    Examples:
      | username      | password      |
      | standard_user | fake_password |

  Scenario Outline: Logging in with correct details
    Given I input a "<username>"
    And I input a "<password>"
    When I press the login button
    Then I should be on the products page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |