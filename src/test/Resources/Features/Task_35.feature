@Task_35
Feature: Login Test

  Background: User goes to page
    Given user goes to page

  Scenario Outline: Form Test
    When enter firstname "<firstname>" and lastname "<lastname>"
    And enter age "<age>"
    And select country "<country>"
    And enter note "<note>"
    And click send button
    And user validates submission
    Then user quits browser
    Examples:
      | firstname | lastname | age | country | note |
      | ayse | birincilerden | 21 | Turkey | ayse birinci |
      | fatma | ikincilerden | 32 | Turkey | fatma ikinci |
      | hayriye | ucunculerden | 43 | Turkey | hayriye ucuncu |