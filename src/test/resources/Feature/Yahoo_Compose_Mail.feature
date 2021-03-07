@compose_Functionality
Feature: Test the Yahoo Compose mail Functionality
  This will cover the Yahoo Compose mail functionality

  Background:
    Given Launch the browser and navigate to Yahoo login page
    Then user enters "Your Email" as username and "Password" as password and clicks on login button



  Scenario: verify User can send a successful email.
    Given user in Yahoo Yahoo Mail Mail Home Pag
    Then user click on "compose" button
    Then a frame to compose mail gets displayed
    Then user will enter "Test@Yahoo.com" in sender text box
    Then user will enter the "This is a Test" in Subject text box
    Then user will enter the "This is a body" in mail body
    And user will clicks on send button
    Then user will clicks on view message
    Then user will be navigated to sent mail

  Scenario: Verify user cannot send a mail without recipient
    Given user in Yahoo Yahoo Mail Mail Home Pag
    Then user click on "compose" button
    Then a frame to compose mail gets displayed
    And user will clicks on send button
    Then error message should be displayed

  Scenario: Verify user cannot send a mail without a valid recipient
    Given user in Yahoo Yahoo Mail Mail Home Pag
    Then user click on "compose" button
    Then a frame to compose mail gets displayed
    Then user will enter "Test4578" in sender text box
    Then user will enter the "This is a Test" in Subject text box
    Then user will enter the "This is a body" in mail body
    And user will clicks on send button
    Then error message should be displayed


  Scenario: verify user can send a mail without subject.
    Given user in Yahoo Yahoo Mail Mail Home Pag
    Then user click on "compose" button
    Then a frame to compose mail gets displayed
    Then user will enter "Test@Yahoo.com" in sender text box
    And user will clicks on send button
    Then warning pop up should be visible for sending a mail without subject
    Then user clicks on ok button
    Then user will clicks on view message
    Then user will be navigated to sent mail

  Scenario: verify user can send a mail without subject and mail body
    Given user in Yahoo Yahoo Mail Mail Home Pag
    Then user click on "compose" button
    Then a frame to compose mail gets displayed
    Then user will enter "Test@Yahoo.com" in sender text box
    And user will clicks on send button
    Then warning pop up should be visible for sending a mail without subject
    Then user clicks on ok button
    Then user will clicks on view message
    Then user will be navigated to sent mail

  Scenario: Verify user can able to discard the currently composing pop up
    Given user in Yahoo Yahoo Mail Mail Home Pag
    Then user click on "compose" button
    Then a frame to compose mail gets displayed
    Then user clicks on close button


  Scenario: Verify user can able to see the options in compose message pop up
    Given user in Yahoo Yahoo Mail Mail Home Pag
    Then user click on "compose" button
    Then a frame to compose mail gets displayed
    Then user clicks on vertical dots
    Then options menu should appear

  Scenario: Verify that on clicking ‘Compose’ button, a frame to compose a mail gets displayed and user can enter email Ids in ‘To’, ‘cc’ and ‘bcc’ sections
    Given user in Yahoo Yahoo Mail Mail Home Pag
    Then user click on "compose" button
    Then a frame to compose mail gets displayed
    Then user clicks on Cc,Bcc button to enable fields
    Then ‘cc’ and ‘bcc’ fields should be visible
    And user can enter email Ids in ‘To’, ‘cc’ and ‘bcc’






