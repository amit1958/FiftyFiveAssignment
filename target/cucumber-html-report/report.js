$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GetAllToDO.feature");
formatter.feature({
  "line": 2,
  "name": "API Automation",
  "description": "",
  "id": "api-automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Validate the ToDO Api response",
  "description": "",
  "id": "api-automation;validate-the-todo-api-response",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@todo1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User sets the API request for All To Do \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User sends the api Request to get all todos",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "All todo should come in response with status \u003ccode\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "api-automation;validate-the-todo-api-response;",
  "rows": [
    {
      "cells": [
        "URL",
        "code"
      ],
      "line": 11,
      "id": "api-automation;validate-the-todo-api-response;;1"
    },
    {
      "cells": [
        "https://jsonplaceholder.typicode.com",
        "200"
      ],
      "line": 12,
      "id": "api-automation;validate-the-todo-api-response;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Validate the ToDO Api response",
  "description": "",
  "id": "api-automation;validate-the-todo-api-response;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@todo1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User sets the API request for All To Do https://jsonplaceholder.typicode.com",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User sends the api Request to get all todos",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "All todo should come in response with status 200",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("GetToDO.feature");
formatter.feature({
  "line": 2,
  "name": "API Automation",
  "description": "",
  "id": "api-automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Validate the ToDO Api response",
  "description": "",
  "id": "api-automation;validate-the-todo-api-response",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@todo1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User sets the API request \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User sends the api Request to get a todos",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "A todo should come in response with status \u003ccode\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "api-automation;validate-the-todo-api-response;",
  "rows": [
    {
      "cells": [
        "URL",
        "code"
      ],
      "line": 11,
      "id": "api-automation;validate-the-todo-api-response;;1"
    },
    {
      "cells": [
        "https://jsonplaceholder.typicode.com",
        "200"
      ],
      "line": 12,
      "id": "api-automation;validate-the-todo-api-response;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Validate the ToDO Api response",
  "description": "",
  "id": "api-automation;validate-the-todo-api-response;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@todo1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User sets the API request https://jsonplaceholder.typicode.com",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User sends the api Request to get a todos",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "A todo should come in response with status 200",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});