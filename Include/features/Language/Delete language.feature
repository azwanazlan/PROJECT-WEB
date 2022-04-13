  
  
  Feature: Delete Language
  
  	
  	Scenario Outline: Successfully delete a language
    
    Given user navigate to Language page
    When user select a language checkbox <language>
    And user click on delete language button
    Then user should be able to delete a language successfully
    
    Examples:
    |	language	|
    |	Malay			|
      
   Scenario Outline: Users delete more than one language
     
    Given user navigate to Language page
   	When user select more than one language checkbox <language1> and <language2>
    And user click on delete language button
    Then user should be able to delete multiple language successfully
    
    Examples:
    | language1		|		language2		|
    |  Mandarin		|			Thai			|
    
