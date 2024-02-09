@LoginScenarioOutline
Feature: Login Scenario Outline

  Background: User goes to homepage
    Given user goes to homepage

  @PositiveLoginParam
  Scenario Outline: Positive Login
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks on submit button
    Then user validates sign in
    And user closes browser
    Examples:
      | username                      | password      |
      | clarusway@hotmail.com         | Clarusway.123 |
      | john.doe@gmail.com            | John.123      |
      | john.doe.clarusway@gmail.com  | John.123      |
      | john.doe.clarusway2@gmail.com | John.123      |

  @MultiParametersPositive
  Scenario Outline: Positive Login
    When user enters username "<username>" and password "<password>"
    And user clicks on submit button
    Then user validates sign in
    And user closes browser
    Examples:
      | username                      | password      |
      | clarusway@hotmail.com         | Clarusway.123 |
      | john.doe@gmail.com            | John.123      |
      | john.doe.clarusway@gmail.com  | John.123      |
      | john.doe.clarusway2@gmail.com | John.123      |

  @MultiParametersNegative
  Scenario Outline: Negative Login Scenario Outline
    When user enters username "<username>" and password "<password>"
    Then user clicks on submit button
    Then user validates error message
    And user closes browser
    Examples:
      | username               | password      |
      | clarusway@hotmail.com  | XYZ           |
      | XYZ@hotmail.com        | Clarusway.123 |
      |                        |               |
      | john.doe.XYZ@gmail.com | XYZ           |
      | clarusway@hotmail.com  |               |
      |                        | Clarusway.123 |