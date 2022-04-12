
Feature: Edit Existing Language

  
  Scenario: Successfully rename the language
    
    Given user navigate to Language page
    When user click on language name
    And user rename the language name
    And user click on save language button
    Then user should be able to rename the language

   