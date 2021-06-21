
Feature: API Automation
 

  @todo1
  Scenario Outline: Validate the ToDO Api response
    Given User sets the API request <URL>
    When User sends the api Request to get a todos
		Then A todo should come in response with status <code>
    Examples: 
      | URL  																				|code|
      | https://jsonplaceholder.typicode.com|200|
       
