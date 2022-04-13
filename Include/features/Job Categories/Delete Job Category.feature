Feature: Delete Job Category

  
  Scenario: Successfully delete a job category
    
    Given users navigate to job categories page
    When users select a job category 
    And users click on delete job category button
    And users click on delete job category confirmation button
		Then users should be able to delete a job category
    
		
		
  Scenario: Users delete more than one job category
   
    Given users navigate to job categories page
    When users select more than one job category 
    And users click on delete job category button
    And users click on delete job category confirmation button
		Then users should be able to delete more than one job category
    

