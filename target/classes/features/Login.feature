Feature: Verifying Login Function

  Scenario: Login with Valid Credentials
    Given User is on landing page
    When User is on Listing page and click on Subscribe Button
    And Enter valid moble number and submit
    Then Enter Otp field should show
    And Enter Valid OTP and submit
    Then user should successfully login
    
    

  Scenario: Login with InvalidValid Credentials
    Given User is on landing page
    When User is on Listing page and click on Subscribe Button
    And Enter invalid moble number and submit
    Then Instruction message should show
