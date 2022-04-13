
Feature: Add Education Level

  
  Scenario Outline: Successfully add new education level
    
    Given user navigate to education page
    When user click on add education button
    And user enter education level name <education>
    And user click on save education button
    Then user should be able to add new education level successfully
    
    Examples:
    | education			|
    | SPM						|
    | Matriculation	|
    |	Diploma				|
    
   Scenario Outline: Users enter the same education level
    
    Given user navigate to education page
    When user click on add education button
    And user enter education level name <education>
    And user click on save education button
    Then education level already exists message will appear
    
    Examples:
    | education	|
    |		SPM			|
    
    Scenario: User did not enter education level
    
    Given user navigate to education page
    When user click on add education button
   	And user click on save education button
    Then education level input required message will appear