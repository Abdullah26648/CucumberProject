@Task_37
Feature: Parallel Run Task

  Scenario: Positive Login
      Given goes to "https://thinking-tester-contact-list.herokuapp.com/"
    Then users enters username "clarusway@hotmail.com"
    And users enters password "Clarusway.123"
    And users clicks on submit button
    And users validates sign in
    Then users closes browser