Feature: Verifying City Listing in Header
  Background: user land on the landing page.
   Given User is on the landing page
   
  Scenario: Validating the Default City as per Geo Location
    When Check city listing
    Then User should come with defaul city as per location
		And Verify City manually
 
    
  
