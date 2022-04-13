
Feature: Edit Existing Language

  
  Scenario Outline: Successfully rename the language
    
    Given user navigate to Language page
    When user click on language name <language>
    And user rename the language name <renameTo>
    And user click on save language button
    Then user should be able to rename the language
    
    Examples:
    |		language	| 	renameTo  |
    |		Arabic		| 	Mandarin	|

  Scenario Outline: Users enter the same language
   
   	Given user navigate to Language page
    When user click on existing language name <existingLanguage>
    And user rename the language name with another existing language <existingLanguage2>
    And user click on save language button
    Then language already exists message will appear
    
    Examples:
    |  existingLanguage	|  existingLanguage2  |
    |    Mandarin				|      English				|
    
   Scenario Outline: Users leave the form blank
   
   	Given user navigate to Language page
    When user click on existing language name <existingLanguage> 
    And user leave the form blank
    And user click on save language button
    Then input required message will appear
    
    Examples:
    |  existingLanguage	|
    |    Mandarin				|
    	