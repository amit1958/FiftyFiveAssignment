@ui
Feature: Verifying ToDOs

  Scenario: Checking the Correct page navigation.
    Given User open  the given URL
    Then User should navigate to the Correct page

  Scenario: Check the Page Heading and Field is vaialble or not as expeced
    When User on the page check the Heading present or not
    And Also verify the Text box field availabe or not.

  Scenario Outline: : Verify Add a Todo
    When User enter "<ToDo>" Name and submit
    Then Todo should added

    Examples: 
      | ToDo              |
      | Amit Sharma todo1 |
      | Amit Sharma todo2 |
      | Amit Sharma todo3 |
      | Amit Sharma todo4 |

  Scenario: Verify Item Left after adding the todos
    When User view the itemleft
    Then Item left count should show

  Scenario: Verify Complete  the todo
    When User complete the todo
    Then verify the Completed filter and its list

  Scenario: Verify Filters
    When User click on active filter and check selected or not.
    When User click on All filter and check selected or not.

  Scenario: Verify Clear Completed
    When User click clear completed

  Scenario: Verify Edit the todo
    When User edit the todo
    Then Verify the edited todo

  Scenario: Verify Item Left after deleting the todo
    Then Delete a todo and validate count
