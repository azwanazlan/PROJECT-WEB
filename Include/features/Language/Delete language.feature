  
  
  Feature: Delete Language
  
  	
  	Scenario: Successfully delete a language
    
    Given user navigate to Language page
    When user select a language checkbox
    And user click on delete language button
    Then user should be able to delete a language successfully
    
      
   Scenario: Users delete more than one language
     
    Given user navigate to Language page
   	When user select multiple language checkbox
    And user click on delete language button
    Then user should be able to delete multiple language successfully
    
