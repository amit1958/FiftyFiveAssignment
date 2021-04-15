Feature: Verifying Login Function

  Scenario: Login with InValid Credentials

    When Clicked on myaccount page
    Then Enter valid moble number and do Send OTP
    And Verify Enter Next Button
    Then User should come instruction
    
   
