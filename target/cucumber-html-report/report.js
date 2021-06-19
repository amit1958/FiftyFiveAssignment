$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Todo.feature");
formatter.feature({
  "line": 2,
  "name": "Verifying ToDOs",
  "description": "",
  "id": "verifying-todos",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ToDO"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Checking the Correct page navigation.",
  "description": "",
  "id": "verifying-todos;checking-the-correct-page-navigation.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open  the given URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should navigate to the Correct page",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDO.GotoURL()"
});
formatter.result({
  "duration": 474647800,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.Verify_PageTitle()"
});
formatter.result({
  "duration": 9323900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Check the Page Heading and Field is vaialble or not as expeced",
  "description": "",
  "id": "verifying-todos;check-the-page-heading-and-field-is-vaialble-or-not-as-expeced",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User on the page check the Heading present or not",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Also verify the Text box field availabe or not.",
  "keyword": "And "
});
formatter.match({
  "location": "ToDO.Checkheader()"
});
formatter.result({
  "duration": 86639100,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.CheckTextbox()"
});
formatter.result({
  "duration": 134703800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": ": Verify Add a Todo",
  "description": "",
  "id": "verifying-todos;:-verify-add-a-todo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User enter \"\u003cToDo\u003e\" Name and submit",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Todo should added",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "verifying-todos;:-verify-add-a-todo;",
  "rows": [
    {
      "cells": [
        "ToDo"
      ],
      "line": 17,
      "id": "verifying-todos;:-verify-add-a-todo;;1"
    },
    {
      "cells": [
        "Amit Sharma todo1"
      ],
      "line": 18,
      "id": "verifying-todos;:-verify-add-a-todo;;2"
    },
    {
      "cells": [
        "Amit Sharma todo2"
      ],
      "line": 19,
      "id": "verifying-todos;:-verify-add-a-todo;;3"
    },
    {
      "cells": [
        "Amit Sharma todo3"
      ],
      "line": 20,
      "id": "verifying-todos;:-verify-add-a-todo;;4"
    },
    {
      "cells": [
        "Amit Sharma todo4"
      ],
      "line": 21,
      "id": "verifying-todos;:-verify-add-a-todo;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": ": Verify Add a Todo",
  "description": "",
  "id": "verifying-todos;:-verify-add-a-todo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ToDO"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User enter \"Amit Sharma todo1\" Name and submit",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Todo should added",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Amit Sharma todo1",
      "offset": 12
    }
  ],
  "location": "ToDO.Enter_todoname(String)"
});
formatter.result({
  "duration": 1178912800,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.VerifyAdded_TODO()"
});
formatter.result({
  "duration": 84394100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": ": Verify Add a Todo",
  "description": "",
  "id": "verifying-todos;:-verify-add-a-todo;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ToDO"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User enter \"Amit Sharma todo2\" Name and submit",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Todo should added",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Amit Sharma todo2",
      "offset": 12
    }
  ],
  "location": "ToDO.Enter_todoname(String)"
});
formatter.result({
  "duration": 1140801500,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.VerifyAdded_TODO()"
});
formatter.result({
  "duration": 77290400,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": ": Verify Add a Todo",
  "description": "",
  "id": "verifying-todos;:-verify-add-a-todo;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ToDO"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User enter \"Amit Sharma todo3\" Name and submit",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Todo should added",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Amit Sharma todo3",
      "offset": 12
    }
  ],
  "location": "ToDO.Enter_todoname(String)"
});
formatter.result({
  "duration": 1146188000,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.VerifyAdded_TODO()"
});
formatter.result({
  "duration": 75654400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": ": Verify Add a Todo",
  "description": "",
  "id": "verifying-todos;:-verify-add-a-todo;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ToDO"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User enter \"Amit Sharma todo4\" Name and submit",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Todo should added",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Amit Sharma todo4",
      "offset": 12
    }
  ],
  "location": "ToDO.Enter_todoname(String)"
});
formatter.result({
  "duration": 1120725300,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.VerifyAdded_TODO()"
});
formatter.result({
  "duration": 118600500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify Item Left after adding the todos",
  "description": "",
  "id": "verifying-todos;verify-item-left-after-adding-the-todos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User view the itemleft",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Item left count should show",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDO.viewLeftcount()"
});
formatter.result({
  "duration": 87194900,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.LeftCount()"
});
formatter.result({
  "duration": 2047681200,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify Complete  the todo",
  "description": "",
  "id": "verifying-todos;verify-complete--the-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "User complete the todo",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "verify the Completed filter and its list",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDO.completeTodo()"
});
formatter.result({
  "duration": 2309312100,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.completeted()"
});
formatter.result({
  "duration": 2196079200,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Verify Filters",
  "description": "",
  "id": "verifying-todos;verify-filters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "User click on active filter and check selected or not.",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User click on All filter and check selected or not.",
  "keyword": "When "
});
formatter.match({
  "location": "ToDO.ActiveFilter()"
});
formatter.result({
  "duration": 2161148700,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.AllFilter()"
});
formatter.result({
  "duration": 2138921100,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Verify Clear Completed",
  "description": "",
  "id": "verifying-todos;verify-clear-completed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "User click clear completed",
  "keyword": "When "
});
formatter.match({
  "location": "ToDO.ClearCompleted()"
});
formatter.result({
  "duration": 295414700,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Verify Edit the todo",
  "description": "",
  "id": "verifying-todos;verify-edit-the-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "User edit the todo",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Verify the edited todo",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDO.EditTodo()"
});
formatter.result({
  "duration": 1555874700,
  "status": "passed"
});
formatter.match({
  "location": "ToDO.VerifyEditTodo()"
});
formatter.result({
  "duration": 82483700,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Verify Item Left after deleting the todo",
  "description": "",
  "id": "verifying-todos;verify-item-left-after-deleting-the-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "Delete a todo and validate count",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDO.deleteTodo()"
});
formatter.result({
  "duration": 1636442300,
  "status": "passed"
});
});