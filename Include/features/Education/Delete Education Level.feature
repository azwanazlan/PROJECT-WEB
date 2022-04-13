Feature: Delete Education Level

  
  Scenario: Successfully delete an education level
    
    Given user navigate to education page
    When user select an education level
    And user click on delete education level button
    Then user should be able to delete an education level successfully
    
   Scenario: Successfully delete more than one education level
    
    Given user navigate to education page
    When user select more than one education level
    And user click on delete education level button
    Then user should be able to delete more than one education level successfully