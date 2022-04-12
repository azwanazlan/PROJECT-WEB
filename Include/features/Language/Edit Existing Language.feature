
Feature: Edit Existing Language

  
  Scenario: Successfully rename the language
    
    Given user navigate to Language page
    When user click on language name
    And user rename the language name
    And user click on save language button
    Then user should be able to rename the language

  Scenario: Users enter the same language
   
   	Given user navigate to Language page
    When user click on language name
    And user rename the language name with existing language
    And user click on save language button
    Then language already exists message will appear
    
   Scenario: Users leave the form blank
   
   	Given user navigate to Language page
    When user click on language name
    And user leave the form blank
    And user click on save language button
    Then input required message will appear
    
    	