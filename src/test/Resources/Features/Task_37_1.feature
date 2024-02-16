@Task_37
Feature: Parallel Run Task

  Scenario: Todo List Data Table

    Given goes to "http://webdriveruniversity.com/To-Do-List/index.html"
    When enters todos
      | Prepare breakfast        |
      | Wash the dishes          |
      | Take care of baby        |
      | Help your kid's homework |
      | Study Selenium           |
      | Sleep                    |
    Then users closes browser