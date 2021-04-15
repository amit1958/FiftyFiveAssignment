Feature: Verifying Login Function

  Scenario: Login with Valid Credentials

    When Click on myaccount page
    Then Enter valid moble number and Send OTP
    And Verify Enter Submit Button
    Then User move to profile page
    
   
