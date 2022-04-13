Feature: Edit Education Level

  
  Scenario Outline: Successfully rename an education level
    
    Given user navigate to education page
    When user select an existing education level <education>
    And user rename the education level
    And user click on save education button
    Then user should be able to rename the education level successfully
    
    Examples:
    |		education	|
    |		SPM				|
    
   Scenario Outline: Users enter existing education level name
    
    Given user navigate to education page
    When user select an existing education level <education>
    And user rename the education level with existing education level <existingEducation>
    And user click on save education button
    Then education level already exists message is displayed
    
    Examples:
    |					education								|   existingEducation	|
    |		Sijil Pelajaran Malaysia			|		Master's Degree		|
    