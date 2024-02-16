@Task_37
Feature: Parallel Run Task

  Scenario: Form Page Data Table List<List<>>

    Given user goes to home page
    When user enters username ,user enters password ,user enters comment
      | john_doe | John.123 | Hello I am John |
      | ali_can  | Ali.123  | Hello I am Ali  |
      | ayse_han | Ayse.123 | Hello I am Ayse |
