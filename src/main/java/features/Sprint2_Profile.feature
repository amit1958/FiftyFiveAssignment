Feature: Verifying Profile submit

  Scenario: Verify New user Profile submit

    When User login
    And Enter the Fields on the profile page
    Then User move to Dealer selection page
    
   
