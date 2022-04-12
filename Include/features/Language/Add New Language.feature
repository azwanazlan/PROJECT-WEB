

Feature: 

  @tag1
  Scenario : Successfully add new language
    
    Given user navigate to Language page
    When user click on Add button
    And user enters <language>
    And user click on Save button
    Then user should be able to add new language successfully

    Examples: 
      | language  |
      | Malay     |
      | Thai			|
      | Mandarin	|