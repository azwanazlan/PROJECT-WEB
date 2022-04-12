

Feature: Add New Language


  Scenario Outline: Successfully add new language
    
    Given user navigate to Language page
    When user click on add language button
    And user enters language <language>
    And user click on save language button
    Then user should be able to add new language successfully

    Examples: 
      | language  |
      | Malay     |
      | Thai			|
      | Mandarin	|
      
   Scenario Outline: Users enter the same language
     
    Given user navigate to Language page
   	When user click on add language button
    And user enters same language <language>
    And user click on save language button
    Then language already exists message will appear
    
     Examples:
     |  language  |
     |	Malay			| 
     
    Scenario: Users leave the language name blank
    
    Given user navigate to Language page
   	When user click on add language button
    And user click on save language button
    Then input required message will appear
    